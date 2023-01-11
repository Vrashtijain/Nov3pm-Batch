package basicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass {

	@Test
	public void verifyHomePage() {
		System.out.println("Home Page has been verified");
	}
	
	//we can use (enabled = false) instead of priority if we want to skip any method
	//or use exclude = group name in case of group execution
}
