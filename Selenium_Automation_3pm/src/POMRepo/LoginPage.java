package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//PageFactory is a class of SELENIUM which have initElements(WebDriver driver, object page)
	//we used this word to indicate current page at place of object page
	//we have created this constructor because SELENIUM don't understand @FindBy which is a java annotation
	//this constructor will be called in other programs by creating an object of it.
	//it is a kind of blueprint which we are going to use again and again in other programs
	//@FindBy is an annotation (Java Template like class, interface, ENUM)
	
	@FindBy(id = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	//we have to make it private because we can't give access to everyone
	//now make getter method to get the access
	//to generate it automatically, right click and then click on source and then generate getter and setter and finally select generate getter

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
		
		public void loginAction(String username, String password) {
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
			
			//@FindBy have all the locators id, class, name, xpath, css etc.
			//we will get path of all the elements from this class and the values we want to pass inside sendKeys from property file
			//we have to make loginAction method here so that we can use it again and again in other programs
		}
	}

