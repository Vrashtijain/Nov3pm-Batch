package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test (priority = 1)
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	@Test (dependsOnMethods = "login")
	public void search() {
		System.out.println("Product found");
	}
	
	@Test (dependsOnMethods = "search")
	public void select() {
		Assert.fail();//used to fail this method and now all the methods depend on it are going to skip
		System.out.println("Product has been selected");
	}
	
	@Test (dependsOnMethods = "select")
	public void addToCart() {
		System.out.println("Product is added to cart");
	}
	
	@Test (dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("Payment made successfully");
	}
	
	@Test (dependsOnMethods = "payment")
	public void logout() {
		System.out.println("Logged out successfully");
	}
}
