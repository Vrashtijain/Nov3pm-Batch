package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		
		String expectedAltText = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actualAltText = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("alt");
		if(actualAltText.equals(expectedAltText)) {
			System.out.println("Pass: The Alt text has been verified.");
		}
		else
			System.out.println("Fail: The Alt text has not been verified.");

		driver.quit();
	}
}
