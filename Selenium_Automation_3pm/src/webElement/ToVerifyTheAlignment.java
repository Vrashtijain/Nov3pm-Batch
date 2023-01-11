package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAlignment {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Point usernameLoc = driver.findElement(By.id("username")).getLocation();
		Point passwordLoc = driver.findElement(By.name("pwd")).getLocation();
		
		System.out.println(usernameLoc);
		
		int usernameStartX = usernameLoc.getX();
		int usernameStartY = usernameLoc.getY();
		
		System.out.println("The username startX is:"+usernameStartX);
		System.out.println("The username startY is:"+usernameStartY);

		System.out.println("=======================");
		System.out.println(passwordLoc);
		
		int passwordStartX = passwordLoc.getX();
		int passwordStartY = passwordLoc.getY();
		
		System.out.println("The password startX is:"+passwordStartX);
		System.out.println("The password startY is:"+passwordStartY);

		if(usernameStartX == passwordStartX) {
			System.out.println("Pass: The textfields are alligned.");
		}
		else
			System.out.println("Fail: The textfields are not alligned.");

		

	}
}
