package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutilityClasses.Utility;

public class NeoStoxHomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath = "(//a[@class='neobutton'])[25]") private WebElement closeButton;
	@FindBy (id = "lbl_username") private WebElement userName;
	@FindBy(id = "lbl_curbalancetop") private WebElement currBalance;
	@FindBy(id = "lnk_logout") private WebElement logoutButton;
	
	
	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void handlePopup(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		if(okButton.isDisplayed())
		{
			Utility.wait(driver,3000);
			Reporter.log("Clicking OK button", true);
			okButton.click();
			Utility.wait(driver, 3000);
			Reporter.log("Clicking close button", true);
			closeButton.click();
		}
		else
		{
			Utility.wait(driver, 1000);
			Reporter.log("No Popup, proceeding further", true);
		}
	}
	
	public String getActualUserName(WebDriver driver)
	{
		Utility.wait(driver, 3000);
		String actualUserName = userName.getText();
		String realName = actualUserName.substring(3);
		Reporter.log("real User Name is "+realName, true);
		return actualUserName;
		}
	public void logoutFormNeoStox(WebDriver driver) throws InterruptedException
	{
		
		Utility.wait(driver, 3000);
		userName.click();
		Thread.sleep(3000);
		logoutButton.click();
	}	
	
	public String getBalance(WebDriver driver)
	{
		Utility.wait(driver, 3000);
		String actualBalance = currBalance.getText();
		Reporter.log("Getting Balance...", true);
		Reporter.log("Actual Balance is"+actualBalance+"...", true);
		return actualBalance;
		
	}
}


