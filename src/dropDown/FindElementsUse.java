package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 14 pro max");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@class='sbct'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[4]")).click();
		List<WebElement> listofimages = driver.findElements(By.tagName("img"));
		System.out.println(listofimages.size());
		for(WebElement lm:listofimages)
		{
			System.out.println(lm.getText());
		}
	}

}
