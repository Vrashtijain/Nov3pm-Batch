package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		WebElement disabledButton = driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//we have done downCasting because there is no relation between WebDriver and JavaScriptExecutor interfaces. They are connected only by RemoteWebDriver class.
		js.executeScript("arguments[0].click()", disabledButton);
		//Java script executer mostly used for disabled element but we can use it for enabled element as well
		//("argument[0].click()",web Element);
		//("argument[0].value='abc'",WE);
		//("argument[0].scrollIntoView(true/false),WE);
		//("window.scrollBy(x,y)");
		
	}
}
