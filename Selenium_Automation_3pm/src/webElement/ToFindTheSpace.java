package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTheSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Rectangle usernameRect = driver.findElement(By.id("username")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("pwd")).getRect();
		
		int usernameEndY = usernameRect.getY()+usernameRect.getHeight();
		int passwordStartY = passwordRect.getY();
		
		int space = passwordStartY - usernameEndY;
		System.out.println("The Space is :"+space);
	}
}
