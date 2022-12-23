package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile= new File("E:\\New folder (2)\\ExcelFiles\\Book1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		double NumericCellValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(NumericCellValue);
		
		boolean BooleanCellValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(BooleanCellValue);

	}

}
