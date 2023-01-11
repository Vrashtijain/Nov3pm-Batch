package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTextField =driver.findElement(By.id("username"));
		WebElement passwordTextField =driver.findElement(By.id("password"));
		
		usernameTextField.clear();
		Thread.sleep(2000);

		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		
		passwordTextField.clear();
		Thread.sleep(2000);

		passwordTextField.sendKeys("Test@123");

	}
}
