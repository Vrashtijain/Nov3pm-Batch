package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchIntAndBooleanDataFromExcel {

	public static void main(String[] args) throws IOException {
		
	
		FileInputStream fis = new FileInputStream("./testData/excelData1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet2");
		double intValue = sheet.getRow(0).getCell(0).getNumericCellValue();
		boolean booleanValue = sheet.getRow(0).getCell(1).getBooleanCellValue();
		
		System.out.println(intValue);
		System.out.println(booleanValue);
	
	}
}
