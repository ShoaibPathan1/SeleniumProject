package neoStoxTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import neoStoxBaseClasses.Base;
import neoStoxPOMClasses.LoginPage;
import neoStoxPOMClasses.NeoStoxBasePage;
import neoStoxPOMClasses.NeoStoxHomePage;
import neoStoxPOMClasses.NeoStoxPasswordPage;
import neoStoxutilityClasses.Utility;



public class ValidteUserName extends Base {
	LoginPage login;
	NeoStoxBasePage first;
	NeoStoxPasswordPage pwd;
	NeoStoxHomePage home;
	
	@BeforeClass
	public void launchNeoStox()
	{
		launchBrowser();
		login= new LoginPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		first= new NeoStoxBasePage(driver);
		home= new NeoStoxHomePage(driver);
		
	
	
	}
	@BeforeMethod
	public void loginToStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		first.clickOnSignInButton(driver);
		login.enterMobileNumber(driver, Utility.readExcelData(0, 0));
		login.clickLoginButton(driver);
		pwd.enterPassword(driver, Utility.readExcelData(0, 1));
		pwd.enterSubmitButton(driver);
		home.handlePopup(driver);
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUserName(driver), Utility.readExcelData(0, 2), "Actual & Expected dont match Tc failed");
	  Utility.screenShot(driver, "SS");
  }
  
  @Test
  public void gettingBalance() throws InterruptedException
  {
	  Utility.wait(driver, 3000);
	  Thread.sleep(3000);
	  home.getBalance(driver);
  }
  @AfterMethod
  public void logoutfromNeoStox() throws InterruptedException
  {
	  Utility.wait(driver, 3000);
	  Thread.sleep(3000);
	  home.logoutFormNeoStox(driver);
	  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
