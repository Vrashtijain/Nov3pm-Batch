package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassD {

	@Test
	public void demo2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
	}
	
	//to run more than 1 class parallel, we will select them and convert to TestNG and change the name as ParallelExecutiontestng
	//now open it and do some changes
	//copy everything from <test> to </test> and past it immediately after</test> now from 1st code remove classD line and from 2nd code remove classC line 
	//and change name test1 and test2
	//and in <suit> tag write parallel = "tests"
	//now run the XML code by right click and run as suite
}
