package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDropInFrame {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");	
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
				//driver.switchTo.frame("abc/id value")
				//driver.switchTo.frame(index)
				//driver.switchTo.frame(WebElement)
		
		WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement destination = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
	}
}
