package popUpStudy;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Start Selenium Practice")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String mainhandle = it.next();
		String childpagehandle = it.next();
		System.out.println(mainhandle);
		System.out.println(childpagehandle);
		driver.switchTo().window(childpagehandle);
		driver.findElement(By.linkText("Contact Us")).click();
		driver.switchTo().window(mainhandle);
		Thread.sleep(1000);
		driver.findElement(By.linkText("About us")).click();
		
		
		

	}

}
