package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthenticationPopUpUsingAutoIt {

	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		/*sleep(2000)
		send("admin")
		sleep(2000)
		send("{TAB}")
		sleep(2000)
		send("manager")
		sleep(2000)
		send("{TAB}")
		sleep(2000)
		send("{ENTER}")
		
		write this in sciTE and save it as auth.au3 and click on tools and compile then from files folder copy .exe file generated after compilation and paste it inside autoIt folder
		 */
		
		Runtime.getRuntime().exec("./autoIt/auth.exe");
	}
}
