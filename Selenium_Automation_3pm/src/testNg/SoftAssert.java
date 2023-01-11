package testNg;

import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	public void demo() {
		boolean expectedData = true;
		boolean actualData = false;

		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualData, expectedData);
		System.out.println("Pass");// it will execute even after failing
		s.assertAll();
		System.out.println("abc"); //it will not execute 
		System.out.println("fgh"); //it will also not execute
		
	}
}
