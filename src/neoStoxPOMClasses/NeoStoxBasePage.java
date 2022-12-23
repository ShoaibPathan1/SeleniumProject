package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutilityClasses.Utility;

public class NeoStoxBasePage 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signInButton;
	
	public NeoStoxBasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton(WebDriver driver)
	{
		Utility.wait(driver	,1000);
		Reporter.log("Clicing on SignIn button", true);
		signInButton.click();
	}

}
