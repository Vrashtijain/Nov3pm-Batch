package activeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToActiveElement {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement active = driver.switchTo().activeElement();
		active.sendKeys("Qspiders");
		Thread.sleep(3000);
		List<WebElement> allTheAutoSuggestions = driver.findElements(By.xpath("//span[text()='qspiders']"));
		System.out.println(allTheAutoSuggestions.size());
		
		for(WebElement suggestions : allTheAutoSuggestions) {
			System.out.println(suggestions.getText());
		}
	}
}
