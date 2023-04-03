package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	WebDriver driver;

	public Landingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	WebElement signin;
	@FindBy(xpath = "//input[@id='user_email']")
	WebElement emailid;
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement pswd;
	@FindBy(xpath = "//*[@id='homepage']/header/div[2]/div/nav/ul")
	WebElement navbar;

	public WebElement signIn() {
		return signin;
	}

	public WebElement email() {
		return emailid;
	}

	public WebElement password() {
		return pswd;
	}

	public WebElement navBar() {
		return navbar;
	}

}
