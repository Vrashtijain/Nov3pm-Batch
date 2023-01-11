package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.kwokyinmak.com/");
		
		Thread.sleep(5000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)" );
		//we can also use window.scrollTo instead of scrollBy
		js.executeScript("history.go(0)");
		//to refresh the page
		 String title = js.executeScript("return document.title").toString();
		 //to get the title
		System.out.println(title);
		
	}
}
