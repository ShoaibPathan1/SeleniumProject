package upStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(5000);
		File myFile= new File("E:\\New folder (2)\\ExcelFiles\\UpstoxData.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
//		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
//		driver.findElement(By.id("userCode")).sendKeys(UN);
		
		driver.findElement(By.id("userCode")).sendKeys(mySheet.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("yob")).sendKeys(mySheet.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(7000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	}

}
