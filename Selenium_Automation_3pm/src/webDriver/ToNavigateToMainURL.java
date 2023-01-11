package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToMainURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	//first write new ChromeDriver() then = and then driver after that we will click on create local variable
	 //only WebDriver and Remote WebDriver have get() method 
	 
	 driver.get("https://www.facebook.com/");
	 //https protocol is necessary to write if not written then we will get InvalidArgumentException
	 
	}

}
