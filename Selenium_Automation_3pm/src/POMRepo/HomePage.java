package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	//create this global variable to use all the methods present inside driver class
	//and we have to initialize it inside constructor
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "logoutLink")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void logoutAction() {
		logoutButton.click();
	}
	
}
