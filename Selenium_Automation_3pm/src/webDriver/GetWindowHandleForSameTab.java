package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleForSameTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String googleId=driver.getWindowHandle();
		System.out.println(googleId);
		
		driver.navigate().to("https://www.facebook.com/");
		String facebookID=driver.getWindowHandle();
		System.out.println(facebookID);

	}

}
