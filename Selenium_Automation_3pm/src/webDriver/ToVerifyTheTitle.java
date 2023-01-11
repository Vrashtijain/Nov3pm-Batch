package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		String expectedTitle="Facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println("The Title of the WebPage is: "+actualTitle);
		
		if(actualTitle.contains(expectedTitle)) {
			//we can also write actualTitle.equals(expectedTitle)
			System.out.println("Pass: The title is verified");
		}
		else {
			System.out.println("Fail: The title is not verified");
		}
			
		}
	}


