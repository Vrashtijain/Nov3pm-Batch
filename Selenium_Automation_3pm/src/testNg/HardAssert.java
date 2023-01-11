package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo() {
		String expectedData = "abc";
		String actualData = "ab";
				
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Pass");
		
		//for critical or major features we will use hard assert because it will stop the execution immediately after getting a defect
		//Assert is a class which have many static methods such as assertEquals(ac,ex)
		//for minor features we will use soft assert because it will not stop the execution until we will use .assertAll() method
		//for soft assert we will create an object to get the access of its non static methods
		//SoftAssert s = new SoftAssert();
		//s.assertEquals(ac,ex);
	}
}
