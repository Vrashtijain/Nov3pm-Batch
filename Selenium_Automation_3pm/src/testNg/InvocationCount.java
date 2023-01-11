package testNg;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test (invocationCount = 5)
	public void demoTest() {
		System.out.println("Test");
	}
	
	//used to run the same test script multiple times
}
