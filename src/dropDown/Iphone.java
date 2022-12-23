package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("Iphone 14 pro max");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='IPhone 14 Pro Max';", searchBox);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@class='sbct'])[3]")).click();
		
		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//li[@class='sbct'])[8]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Images")).click();
//		List<WebElement> imgsize = driver.findElements(By.tagName("img"));
//		System.out.println(imgsize.size());
//		for(WebElement i:imgsize)
//		{
//			System.out.println("Image name "+i.getText());
//		}
		
		

	}

}
