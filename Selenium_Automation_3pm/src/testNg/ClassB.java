package testNg;

import org.testng.annotations.Test;

public class ClassB {

	@Test (groups = "regression")
	public void payment() {
		System.out.println("Payment made successfully");
	}
		
	@Test (groups = "smoke")
	public void logout() {
		System.out.println("Logged out successfully");
	}
}
