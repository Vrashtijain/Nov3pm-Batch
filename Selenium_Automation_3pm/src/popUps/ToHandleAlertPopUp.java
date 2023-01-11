package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		//after switchTo() we use target Locator(window(), activeElement(), frame(), alert())
		//alert interface contains accept(), dismiss(), sendKeys(), getText()
	}
}
	/*Pop Up is a GUI window which gives information or send information
	it is created by using javaScript and it is not a part of our webPage
	there are 8 types of pop up-
	1)JavaScript Pop
		a)Alert PopUp- 
			i)whether the popup is inspectable
			ii)if yes- findElement()
			iii)if no-see whether selenium libraries are there or not
		b)Confirmation PopUp
		c)Prompt PopUp
	2)Hidden Division PopUp
	3)ChildBrowser
	4)Notification PopUp
	5)FileUpload PopUp
	6)Authentication PopUp
	 */
