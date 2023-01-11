package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/excelData1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue("Name");
		
		FileOutputStream fos = new FileOutputStream("./testData/excelData1.xlsx");
		workbook.write(fos);
		
		}
}
