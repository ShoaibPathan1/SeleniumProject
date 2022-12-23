package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutilityClasses.Utility;

public class NeoStoxPasswordPage
{
@FindBy(id = "txt_accesspin") private WebElement password;
@FindBy(xpath = "//a[@class='btn btn-neo']") private WebElement submit;

public NeoStoxPasswordPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterPassword(WebDriver driver, String pass) throws InterruptedException
{
	Utility.wait(driver, 3000);
	Reporter.log("Entering Password", true);
	password.sendKeys(pass);
	Thread.sleep(5000);
}

public void enterSubmitButton(WebDriver driver)
{
	Utility.wait(driver, 3000);
	Reporter.log("Entering Submit Button",true);
	submit.click();
}

	
}
