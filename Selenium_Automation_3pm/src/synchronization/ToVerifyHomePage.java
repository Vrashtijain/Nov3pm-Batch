package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToVerifyHomePage {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String loginPageTitle = driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		pass.sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String homePageTitle = driver.getTitle();
		System.out.println("Login Page title is:"+loginPageTitle);
		System.out.println("Home Page title is:"+homePageTitle);

	}
}
