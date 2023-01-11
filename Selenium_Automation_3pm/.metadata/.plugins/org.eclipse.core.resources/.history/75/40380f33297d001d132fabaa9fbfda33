package RunTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class classA {

	public static void demoTest(WebDriver driver,String url, String expectedTitle) {
	driver.manage().window().maximize();
	driver.get(url);
	
	String actualTitle = driver.getTitle();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Pass: The title has been verified");
	}
	else
	{
		System.out.println("Fail: The title has not been verified");
	}
	driver.quit();
	}
}
