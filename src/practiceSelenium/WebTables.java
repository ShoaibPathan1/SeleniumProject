package practiceSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		//How many rows in table?
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("How many rows in table?");
		System.out.println(rows.size());
		System.out.println("==============================================================");
		//How many columns in a table?
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//th"));
		System.out.println("How many columns in a table?");
		System.out.println(columns.size());
		System.out.println("==============================================================");
		//How to read a specific data?
		WebElement myData = driver.findElement(By.xpath("//table[@id='product']//tr[3]//td[2]"));
		System.out.println("How to read a specific data?");
		System.out.println(myData.getText());
		System.out.println("==============================================================");
		//How to read whole row using findElements?
		System.out.println("How to read whole row using findElements?");
		List<WebElement> row3 = driver.findElements(By.xpath("//table[@id='product']//tr[3]"));
		Iterator<WebElement> r3 = row3.iterator();
		while(r3.hasNext())
		{
			System.out.println(r3.next().getText());
		}
		System.out.println("==============================================================");
		//How to read whole row using findElement?
		System.out.println("How to read whole row using findElement?");
		for(int i=1;i<=3;i++)
		{
			System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr[3]//td["+i+"]")).getText()+"    ");
		}
		System.out.println();
		System.out.println("==============================================================");
		//How to read whole table?
//		System.out.println("How to read whole table?");
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
			
			if(i==1)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText()+" ");
			}
			else
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText()+" ");
			}
			
			}
			System.out.println();
		}
		
	
	}

}
