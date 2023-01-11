package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/vrash/OneDrive/Desktop/DemoPage.html");
		
		WebElement element = driver.findElement(By.xpath("//input"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//we have done downCasting because there is no relation between WebDriver and JavaScriptExecutor interfaces. They are connected only by RemoteWebDriver class.

		js.executeScript("arguments[0].value='Qspiders'", element);
		//ElementNotInteractableException is an unchecked exception of selenium which occurs when we try to perform action on a disabled element
		//if we will use findElement and sendKeys to pass value then it will throw ElementNotInteractableException
	}
}
