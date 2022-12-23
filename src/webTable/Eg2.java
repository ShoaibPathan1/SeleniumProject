package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
//		String text = driver.findElement(By.xpath("//table[@id='product']//tr[3]//td[3]")).getText();
		
		for(int i=2; i<=11; i++)
		{
			for(int j=1;j<=3;j++)
			{
				String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+" ");
			}
		System.out.println();
		}
		

	}

}
