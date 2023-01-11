package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {
	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		String usernameTagName = usernameTextField.getTagName();
		System.out.println(usernameTagName);
		
		if(usernameTagName.equals("input")) {
			usernameTextField.sendKeys("admin");
		}
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		String passwordTagName = passwordTextField.getTagName();
		System.out.println(passwordTagName);

		
		if(passwordTagName.equals("input")) {
			passwordTextField.sendKeys("manager");
		}
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		String loginButtonTagName = loginButton.getTagName();
		System.out.println(loginButtonTagName);
		
		if(loginButtonTagName.equals("div")) {
			loginButton.click();
		}

		else
			System.out.println("One of the tag name is not matching");
		
	}
}
