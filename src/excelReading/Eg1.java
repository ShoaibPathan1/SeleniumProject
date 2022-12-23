package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile= new File("E:\\New folder (2)\\ExcelFiles\\StringData.xlsx");
		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
//		for(int i=0;i<=2;i++)
//		{
//			String row = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(i).getStringCellValue();
//		System.out.print(row+" ");
//		}
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=2;j++)
		{
			String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
		
	}

}
