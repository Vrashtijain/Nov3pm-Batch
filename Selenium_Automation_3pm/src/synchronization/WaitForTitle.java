package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitle {
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//as per industry standards we use 20 seconds
		//implicit wait is used for findElement or findElements method only
		//implicit wait is necessary to use in each program if findElement method is there or not
		
		driver.get("https://demo.actitime.com/login.do");
		
		String loginPageTitle = driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		// we will use these 2 lines for explicit wait/Intelligent wait. 
		//First we will create an object of webDriverWait to get the access of until method which is non static in nature 
		//and in until method we will pass 1st condition by giving the reference of ExpectedConditions class to get titleContains method or any other method as per the requirement.
		
		String homePageTitle = driver.getTitle();
		//if we will not use explicit wait before this then it will not wait to load a new title and print the old title which was already there
		//if we use thread.sleep here that will give correct title but industry don't use that because of loss of time
		
		System.out.println("Title before login: "+loginPageTitle);
		System.out.println("Title after login: "+homePageTitle);

	}
}
