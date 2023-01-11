package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String windowId1= driver.getWindowHandle();
		System.out.println("Window Id 1 :"+windowId1);
		
		WebDriver driver1=new ChromeDriver();
		String windowId2= driver1.getWindowHandle();
		System.out.println("Window Id 2 :"+windowId2);

	}

}
