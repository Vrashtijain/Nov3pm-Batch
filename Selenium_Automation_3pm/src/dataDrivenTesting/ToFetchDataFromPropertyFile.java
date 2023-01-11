package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/propertyData1.properties");
		//converting physical representation of property file to java representation
		Properties property = new Properties();
		//we have created this object to get the access of load() method
		property.load(fis);
		//loading the keys of the property file
		//we are loading the java representation of property file
	
		String url = property.getProperty("url");
		//calling the value using the key and the key should be exactly same
		System.out.println(url);
		
		String username = property.getProperty("username");
		System.out.println(username);
		
		String password = property.getProperty("password");
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(password);
		passwordTextField.sendKeys(Keys.ENTER);	
		
		/*driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();*/
		
		//we will save the property file by using word .properties

		
	}
}
