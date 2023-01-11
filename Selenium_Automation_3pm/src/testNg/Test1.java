package testNg;

import org.testng.annotations.Test;

public class Test1 {

	@Test 
	public void aDemo() {
		System.out.println("Demo Test a");
	}
	//annotation is a java template which sends the metadata to either a variable or a method
	//@Test annotated method acts as a main method here
	//we can have more than 1 @Test in a class and they will run alphabetically or in increasing order such as 1,2,3
	
	@Test
	public void eDemo() {
		System.out.println("Demo Test e");
	}
	
	@Test 
	public void ADemo() {
		System.out.println("Demo Test A");
	}
	
	@Test 
	public void Demo1() {
		System.out.println("Demo Test 1");
	}
	
	@Test 
	public void Demo2() {
		System.out.println("Demo Test 2");
	}
}
