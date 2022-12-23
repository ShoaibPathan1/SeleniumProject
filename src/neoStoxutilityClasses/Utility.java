package neoStoxutilityClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility 
{
	//commonly used methods
	
	//ExcelReading
	
	public static String readExcelData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("E:\\New folder (2)\\ExcelFiles\\NeoStox.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	//TakeScreenShot
	
	public static void screenShot(WebDriver driver,String SSname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\New folder (2)\\Screenshot\\"+SSname+".jpeg");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
	//wait
	public static void wait(WebDriver driver, int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	

}
