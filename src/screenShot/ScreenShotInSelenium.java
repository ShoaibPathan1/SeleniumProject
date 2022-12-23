package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotInSelenium {

	public static void main(String[] args) throws InterruptedException, IOException  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		String random=RandomString.make(4);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\New folder (2)\\Screenshot\\Screenshot"+random+".jpeg");
		FileHandler.copy(source, dest);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("E:\\New folder (2)\\Screenshot\\Screenshot"+random+".jpeg");
		FileHandler.copy(src, dst);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		File s1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d1= new File("E:\\New folder (2)\\Screenshot\\Screenshot"+random+".jpeg");
		FileHandler.copy(s1, d1);
		
		
		
		
	}

}
