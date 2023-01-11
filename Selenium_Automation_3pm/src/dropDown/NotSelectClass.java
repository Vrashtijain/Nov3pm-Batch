package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectClass {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Select Option']"));
		//we will use this method if dropDown is not present inside <select> tag
		Actions action = new Actions(driver);
		action.sendKeys(element, "Group 2, option 2").sendKeys(Keys.ENTER).perform();
		//we can also do it by hovering over the element and then pass the coordinates and then select that option (by using action class because it is composite method)
		
		
	}
}
