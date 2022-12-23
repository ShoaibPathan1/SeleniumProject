package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(5000);
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(dropDown);
		Thread.sleep(5000);
		//3.	By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("option3");
		
	}

}
