package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAnAutoSuggestion {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		//we will inspect in google search bar only after searching for google in google chrome, already present google bar should not inspect
		Thread.sleep(2000);
		
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
		//inspect on the suggestion we get after searching 'selenium' in google search bar
		//in findElements we will not have to pass unique xpath means 1 of 1, it can be anything like 1 of 10, 1 of 6 etc.
		
		for(WebElement suggestion:allAutoSuggestions ) {
			String option = suggestion.getText();
			
			if(option.equals("selenium webdriver")) {
				suggestion.click();
				break;
			}
		}
	}
}
