package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakesScreenShotOfWebPage {

	public static void main(String[] args) throws IOException  {
		
		Date date = new Date();
		String sysDateTime = date.toString().replace(" ", "_").replace(":", "_");
		//we will concatenate date with filename of screenshot for that i will have to convert it into string type
		//and filename can't accept spaces and colons so we will replace them with underscore by the help of replace method which takes (old char, new char) type of argument
		//we are concatenating date with file name to make file name dynamic otherwise screenshot will get updated only with the same name
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//here we have done upCasting
		//but WebDriver interface is not related to takes screenshot interface
		//both these interfaces are part of RemoteWebDriver
		//so we will do downCasting then all the methods of TakesScreenshot can be accessed by the help of RemoteWebDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//here we have done downCasting
		File source = ts.getScreenshotAs(OutputType.FILE);
		//it will take output type argument where OutputType is an Enum and .FILE is used to convert that screenshot in file type
		//because if not converted in file type then we can't read byte code or any other form of data
		//its return type will be File type because output is file type
		File destination = new File("./screenshots/myntra"+sysDateTime+".png");
		//here we have created an object in which we will provide the path where we want to store our screenshots inside our project of eclipse
		Files.copy(source, destination);
		//Files is a class and copy is a static method of that class which takes (file from,file to) type of argument
	}
}
