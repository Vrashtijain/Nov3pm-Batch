package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		String expectedURL="facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//it will tell what to launch and from where...
		
		
		WebDriver driver = new ChromeDriver();
		//to launch the browser and start the server of driver executable
		
		driver.get("https://www.facebook.com/");
		// navigate to main URL
		
		String actualURL= driver.getCurrentUrl();
		//to fetch the URL of the web page
		
		System.out.println("The URL of the page is: "+actualURL);
		
		if(actualURL.contains(expectedURL)){
			//.contains used to check if that expected string is a part of actual string or not
			System.out.println("Pass: The URL is verified");
		}
			else
				System.out.println("Fail: The URL is not verified");
		}
	}

