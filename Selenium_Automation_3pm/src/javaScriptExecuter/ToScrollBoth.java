package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBoth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_3_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_3_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone&requestId=9222c293-59c9-405a-a6b8-9d8f0ab5acac");
		driver.manage().window().setSize(new Dimension(200,600));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(100,150)");
		//there are many JavaScript snippet which we can use
		
	}
}
