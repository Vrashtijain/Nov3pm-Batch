package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePrintPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/vrash/OneDrive/Desktop/demoWebsiteForPopUp.html");
		
		driver.findElement(By.xpath("//button[text()='Print']")).click();
		
		driver.switchTo().alert().accept();
		//after clicking on print button we are getting alert pop up first we we handle that then click on enter by using robot class because its not part of our webPage
		
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("./autoIt/PrintPop.exe");	
	}
}
