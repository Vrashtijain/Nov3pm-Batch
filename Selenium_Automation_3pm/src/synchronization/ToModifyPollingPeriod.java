package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToModifyPollingPeriod {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		driver.findElement(By.id("email")).sendKeys("vrashtijain99@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("(//button[contains(text(), 'Continue')])[1]"));
		
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		//Cut on pollingEvery means depricated(maybe in next version they will not use this method)
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		//fluent wait is an intelligent wait where we can modify the polling period
		//In industries often explicit and fluent wait are termed as custom wait. or we might require to create our own customized wait
			
		continueButton.click();
	}
}

