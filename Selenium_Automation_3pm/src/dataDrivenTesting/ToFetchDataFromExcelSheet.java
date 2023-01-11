package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/excelData1.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 //workbook, Sheet, Row and cell are interfaces
		 
		 Sheet sheet = workbook.getSheet("Sheet1");
		 Row row = sheet.getRow(1);
		 Cell cell = row.getCell(0);
		 String url = cell.getStringCellValue();
		 //string url = cell.toString();
		/*String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();*/
		 System.out.println(url);
		 
		 String username = row.getCell(1).toString();
		  String password = row.getCell(2).toString();
		 
		 System.out.println(username);
		 System.out.println(password);
		 //A data which is used repeatedly in different test scripts is called Common Data.
		 //A data which is specific to the test scripts is called Test Script Data

	}
}
