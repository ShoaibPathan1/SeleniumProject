package actionsClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		act.click(day).perform();
		
		
		for(int i=0;i<=9;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.click().perform();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		act.keyDown(firstname, Keys.CONTROL).sendKeys("shoaib").build().perform();
		act.keyDown(firstname, Keys.SHIFT).sendKeys("shoaib").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(firstname, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//		act.sendKeys("c").perform();
		Thread.sleep(5000);
		act.moveToElement(lastname).click().perform();
		
		Thread.sleep(500);
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
	
		
		}

}
