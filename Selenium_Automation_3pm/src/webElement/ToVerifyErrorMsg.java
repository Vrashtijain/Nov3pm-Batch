package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg {
	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg="Please try again.";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(2000);
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();
		
		System.out.println(actualErrorMsg);
		System.out.println(expectedErrorMsg);
		
		if(actualErrorMsg.contains(expectedErrorMsg)) {
		System.out.println("Pass: Error msg has been verified");
		}
		else
			System.out.println("Fail: Error msg has not been verified");

		driver.quit();
			

	}
}
