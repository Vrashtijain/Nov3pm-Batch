package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCssValue {

	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String buttonColor = driver.findElement(By.xpath("//a[text()='Create New Account']")).getCssValue("background-color");
		String loginButtonColor = driver.findElement(By.name("login")).getCssValue("background-color");
		String loginButtonColorByXpath = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("background-color");


		System.out.println("The Button color is :"+buttonColor);
		System.out.println("The Button color is :"+loginButtonColor);
		System.out.println("The Button color is :"+loginButtonColorByXpath);

	}
}
