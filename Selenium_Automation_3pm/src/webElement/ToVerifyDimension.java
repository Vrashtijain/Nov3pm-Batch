package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension usernameDim = driver.findElement(By.id("username")).getSize();
		System.out.println(usernameDim);
		
		int usernameWidth = usernameDim.getWidth();
		int usernameHeight = usernameDim.getHeight();

		
		
		System.out.println("The username width is : "+usernameWidth);
		System.out.println("The username height is : "+usernameHeight);
		
		Dimension passwordDim = driver.findElement(By.name("pwd")).getSize();
		System.out.println("===============================");
		System.out.println(passwordDim);

		
		int passwordWidth = passwordDim.getWidth();
		int passwordHeight = passwordDim.getHeight();
		
		System.out.println("The password width is : "+passwordWidth);
		System.out.println("The password height is : "+passwordHeight);
		
		if(usernameWidth == passwordWidth && usernameHeight == passwordHeight) {
			System.out.println("Pass: The Dimensions are verified");
		}
		else
			System.out.println("Fail: The Dimensions are not verified");
		
		driver.quit();
	}
}
