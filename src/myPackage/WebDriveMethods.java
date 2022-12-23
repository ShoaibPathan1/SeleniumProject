package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveMethods {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	String Expctedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	if(ActualTitle.equals(Expctedtitle))
	{
		System.out.println("Both titles match, Test case is passed");
	}
	else {
		System.out.println("Titlles don't match, Test case failed");
	}

	}

}
