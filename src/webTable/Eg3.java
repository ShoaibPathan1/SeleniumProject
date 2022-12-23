package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		for(int i=1;i<=11;i++) //1,2
		{
			for(int j=1;j<=3;j++) //1,2,3
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText(); //(1,1) (1,2) (1,3)
					System.out.print(text+" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ");
				}
				
			}
			System.out.println();
		}

	}

}
