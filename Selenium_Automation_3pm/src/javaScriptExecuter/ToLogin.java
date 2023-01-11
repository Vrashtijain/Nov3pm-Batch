package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin'", usernameTextField);
		js.executeScript("arguments[0].value='manager'", passwordTextField);
		js.executeScript("arguments[0].click()", loginButton);
		//JavascriptException is an unchecked exception of selenium which occurs when java script snippet is incorrect while using the javascriptExecutor methods

		
	}
}
