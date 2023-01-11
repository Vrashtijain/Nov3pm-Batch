package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test (groups = "smoke")
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	@Test (groups = "regression")
	public void search() {
		System.out.println("Product found");
	}
	
	@Test (groups = "regression")
	public void select() {
		Assert.fail();//used to fail this method and now all the methods depend on it are going to skip
		System.out.println("Product has been selected");
	}
	
	@Test (groups = "regression")
	public void addToCart() {
		System.out.println("Product is added to cart");
	}
	
	@Test (groups = "regression")
	public void payment() {
		System.out.println("Payment made successfully");
	}
		
	@Test (groups = "smoke")
	public void logout() {
		System.out.println("Logged out successfully");
	}
	
	//right click and click on testNG and then on convert to testNG and change the name as GroupExecutiontestng, now it is converted into xml code
	//now open XML code and add <groups> <run> <include name="smoke"/> </run> </groups> after <test> if we want to do only smoke testing
	//if we want to run the methods of more than one class then select all the classes by the help of ctrl button then right click and convert to testNG
	//1st line in XML code is called Prologue and 2nd line is called comment
	//these two lines are not necessary to write and also called SKIMA
	
}
