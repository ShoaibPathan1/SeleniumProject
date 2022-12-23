package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HondaAmaze {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Honda Amaze");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		System.out.println(options.size());
		for(WebElement o:options)
		{
			System.out.println(o.getText());
			String actual="honda amaze cng";
			String expected="honda amaze cng";
			if(actual.equals(expected))
			{
				o.click();
				break;
			}
		}
		
			
	}

}
