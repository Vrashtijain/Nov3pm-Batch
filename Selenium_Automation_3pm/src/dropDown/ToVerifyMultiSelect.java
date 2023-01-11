package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown1 = driver.findElement(By.id("oldSelectMenu"));
		Select select1 = new Select(dropdown1);
		boolean multiple1 = select1.isMultiple();
		
		if(multiple1) {
			System.out.println("Pass: The dropdown1 is multiSelect");
		}
		else
			System.out.println("Fail: The dropdown1 is singleSelect");
		
		System.out.println("======================================");
		
		WebElement dropdown2 = driver.findElement(By.id("cars"));
		Select select2 = new Select(dropdown2);
		boolean multiple2 = select2.isMultiple();
		
		if(multiple2) {
			System.out.println("Pass: The dropdown2 is multiSelect");
		}
		else
			System.out.println("Fail: The dropdown2 is singleSelect");
		
		driver.quit();

		
	}
}
