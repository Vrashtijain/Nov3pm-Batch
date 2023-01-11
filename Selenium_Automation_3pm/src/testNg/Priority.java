package testNg;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = 5)
	public void aDemo() {
		System.out.println("Demo Test a");
	}
	
	@Test (priority = -4)
	public void eDemo() {
		System.out.println("Demo Test e");
	}
	
	@Test (priority = 3)
	public void ADemo() {
		System.out.println("Demo Test A");
	}
	
	@Test (priority = 2)
	public void Demo1() {
		System.out.println("Demo Test 1");
	}
	
	@Test (priority = 1)
	public void Demo2() {
		System.out.println("Demo Test 2");
	}
}
