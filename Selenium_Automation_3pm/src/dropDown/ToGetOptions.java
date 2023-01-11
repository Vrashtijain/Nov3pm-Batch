package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetOptions {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		//How to handle dropDown-
		//check whether the dropDown is under <select> tag
		//if it is under <select> tag then use select class methods
		//for that we will have to create an object and pass the webElement inside it.
		//dropDown can be of two types- single select or multi-select(to select multiple options)
		//we have to first check whether the dropDown element is under select tag or not if it is under select tag then use the various non static methods of select class
		//if the dropDown element is not under select tag then use findElement, findElements and actions class
		
		Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		System.out.println("No. of options are:" +allOptions.size());
		System.out.println("================================");
		
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
			//SOP(option); it will print only addresses of all the options because it is of webElement type.
		}
	}
}
