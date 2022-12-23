package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//1. get()- used to launch an url
	driver.get("https://www.amazon.in/");
	
	//2.close()- used to close current tab open using driver
	
	driver.close();
	
	
	driver.get("https://www.flipkart.com/");
	
	//3. quit()-used o close all tabs opened using drivers
	driver.quit();
	
	driver.get("https://www.youtube.com/");
	
	//4.maximize
	driver.manage().window().maximize();
	
	//5.minimize
	driver.manage().window().minimize();
	
	
	
	

	}

}
