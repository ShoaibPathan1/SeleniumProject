package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(5000);
//		act.moveToElement(searchbox).click().sendKeys("I Phone 14 Pro max").build().perform();
//		Thread.sleep(1000);
//		act.doubleClick();
		act.moveToElement(driver.findElement(By.linkText("Mobiles"))).click().perform();
		
	}

}
