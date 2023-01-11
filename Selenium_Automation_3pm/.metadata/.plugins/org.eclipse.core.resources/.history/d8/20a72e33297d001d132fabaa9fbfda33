package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentWindowId =driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(3000);
		
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentWindowId)) {
				String childTitle = driver.getTitle();
				System.out.println(childTitle);
	//System.out.println(driver.getTitle()); we can use this because no need the value in String childTitle
	//if we will write driver.quit(); here then it will give NoSuchSessionException, an unchecked exception in console
			}
		}
		driver.switchTo().window(parentWindowId);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		//System.out.println(driver.getTitle()); we can use this because no need to store the value in String parentTitle

	}
}