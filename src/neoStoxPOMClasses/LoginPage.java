package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutilityClasses.Utility;

public class LoginPage 
{
@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNumber;
@FindBy(xpath = "(//a[text()='Sign In'])[2]") private WebElement loginButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterMobileNumber(WebDriver driver, String moNum)
{
	Utility.wait(driver, 1000);
	Reporter.log("ntering Mobile number" , true);
	mobileNumber.sendKeys(moNum);
}

public void clickLoginButton(WebDriver driver)
{
	Utility.wait(driver, 1000);
	Reporter.log("Clicking Login Button", true);
	loginButton.click();
}

}
