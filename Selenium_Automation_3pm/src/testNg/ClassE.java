package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassE {

	@Parameters("browser")
	@Test
	public void demo (String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			 driver.get("https://www.google.co.in/");
			 
			}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			}
	}
}
