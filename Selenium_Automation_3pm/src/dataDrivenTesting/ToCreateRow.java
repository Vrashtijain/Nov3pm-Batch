package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToCreateRow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./testData/excelData1.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	
	workbook.getSheet("Sheet1").createRow(2).createCell(0).setCellValue("https://facebook.com/");
	//we haven't written anything in row 2 till now so we will use createRow instead of getRow
	
	FileOutputStream fos = new FileOutputStream("./testData/excelData1.xlsx");
	workbook.write(fos);
	
}
}
