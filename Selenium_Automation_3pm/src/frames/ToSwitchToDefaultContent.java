package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSwitchToDefaultContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		 WebElement box = driver.findElement(By.id("draggable"));
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(box, 150, 50).perform();
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 //this method is used to directly switch to web page
		 //driver.switchTo().parentFrame(); this method is used to switch to parent frame
		 
		 driver.findElement(By.xpath("//a[text()='API Documentation']")).click();
	}
		
}
