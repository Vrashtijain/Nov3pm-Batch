package POMRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementReferenceException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		driver.navigate().refresh();
		username.sendKeys("trainee");
		
		/*if we want to pass admin in username then refresh and again pass trainee in username then if we use findElement method to give path and 
		store it in a reference variable and use send keys to pass admin and then by using navigation method to refresh and finally by referring 
		same reference variable we will pass trainee ----> it will give StaleElementReferenceException
		To handle this exception we can again use findElement to pass trainee
		It is happening because internal address of that element get changed after refresh
		*/
		//every time we use login.anything, constructor LoginPage will get load with new address of all the non static variables of @FindBy
	}
}
