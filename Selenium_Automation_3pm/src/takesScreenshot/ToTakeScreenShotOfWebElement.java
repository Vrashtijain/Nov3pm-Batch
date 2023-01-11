package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException  {
		
		Date date = new Date();
		String sysDateTime = date.toString().replace(" ", "_").replace(":", "_");
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://myntra.com/");
	
	File source = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']")).getScreenshotAs(OutputType.FILE);
	//return type was webElement so no need to do downCasting. WebElement interface extends to TakesScreenshot interface so we can directly use getScreenshotAs()
	File destination = new File("./screenshots/myntraLogo"+sysDateTime+".png");
	Files.copy(source, destination);
	
	}
}
