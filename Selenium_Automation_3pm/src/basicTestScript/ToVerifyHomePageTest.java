package basicTestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void verifyHomePageTest() throws EncryptedDocumentException, IOException  {
		
		//no need to use main method anymore as we are using @Test
		
		String expectedTitle = eUtility.fetchDataFromExcelSheets("Sheet2", 2, 0);
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		//using this for explicit wait
		
		HomePage home = new HomePage(driver);

		String actualTitle = home.verifyHomePageTitle();
		
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The title is verified.");
		}
		else
			System.out.println("Fail: The title is not verified.");
			
			no need to use it anymore 
			*/
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified.");

		
		
			   }
}
