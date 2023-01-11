package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//get method is used to navigate to main URL
		Thread.sleep(2000);
		//Thread is a class and sleep is a method in this class which will pause the execution.
		
		Navigation nav=driver.navigate();
		//navigate method is present in web driver method that's why we used driver.navigate() and return type is Navigation
		nav.to("https://www.facebook.com/");
		//to method (present in navigation interface) is used to navigate to another URL/sub-URL
		Thread.sleep(2000);

	
		nav.back();
		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);

		nav.refresh();
		//there are many methods to refresh a page
		//nav.to and use same url again
		//driver.get and use same url again
		//perform nav.forward and nav.backward 
		//perform nav.backward and nav.forward
		//by using javaScriptExecutor js.executeScript(" history.go(0)")
		
		URL url=new URL("https://www.instagram.com/");
		nav.to(url);
		
		System.out.println("Program has ended");
	}

}
