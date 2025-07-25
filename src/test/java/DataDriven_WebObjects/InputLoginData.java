package DataDriven_WebObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputLoginData {

	WebDriver ldriver;

	public InputLoginData(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement user;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement pswrd;

	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement Login;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement Logout;
	
	

	//Entering username.....
	public void EnterUsername(String username) {

		user.sendKeys(username);

	}

	//Entering password.....
	public void EnterPassword(String password) {

		pswrd.sendKeys(password);

	}

	//Clicking Login Button
	public void ClickedLoginButton() {

		Login.click();

	}
	
	//Clicking LogOut Button
		public void ClickedLoggedOutButton() {

			Logout.click();

		}

}
