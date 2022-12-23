package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver" ,"E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
//		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Total number of rows are "+rows.size());
		Thread.sleep(5000);
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr[7]//td"));
		System.out.println("Number of columns in row 7 are "+columns.size());
		System.out.println("=============================================================");
		for(WebElement c:columns)
		{
			System.out.print(c.getText()+" ");
		}
		
		Iterator<WebElement> it = rows.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		

	}

}
