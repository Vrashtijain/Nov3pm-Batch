package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/ClassInfo.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		workbook.getSheet("class").getRow(1).createCell(4).setCellValue("Value");
		
		FileOutputStream fos = new FileOutputStream("./testData/ClassInfo.xlsx");
		workbook.write(fos);
		System.out.println("Date is modified");
		workbook.close();
		/* JSON file will be used in API, json was used only till 3.141.159 and stop using json protocol since selenium4
		   how to make json file- notePad open and write 
			{ 
			"name":"Akash" 
			"id":"123"
			}
		 	and save by using .json extension
			property file is a java feature file which will be saved by using .properties extension
			how to configure feature file- create file and store in project and fetch data by using fileInputStream
			csv is also a feature file we can create it by using .csv extension*/
		
		
	}

}
