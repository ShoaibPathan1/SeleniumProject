package upStox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("userCode")).sendKeys("BA3758");
		//driver.findElement(By.id("password")).sendKeys("Ali@901695");
		driver.findElement(By.name("password")).sendKeys("Ali@901695");
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("yob")).sendKeys("1992");
		Thread.sleep(6000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")).click();
		String ActualText = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
			String Expextedtext = "Pathan R.";
			if(ActualText.equals(Expextedtext))
			{
				System.out.println("Expected Text== Actual Text---> Test Case passed");
			}
				else
				{
					System.out.println("Expected Text is not equal to Actual Text---> Test Case failed");	
				}
			driver.findElement(By.id("funds")).click();
			Thread.sleep(5000);
		String funds = driver.findElement(By.xpath("(//div[@class='p7cB0_D8KuO320HW5wMAn _2LGu0XPz7mYgXhRukvReqt']//div)[2]")).getText();
		System.out.println("Fund Available to Trade are "+funds);
	}

}
