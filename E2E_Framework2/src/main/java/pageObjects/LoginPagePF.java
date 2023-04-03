package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
	WebDriver driver;

	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	WebElement login;
	
	By email = By.xpath("//input[@id='user_email']");
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement pswd;
	
	@FindBy(xpath="//div/input[@type='submit']")
	WebElement submit;
	

	public WebElement login() {
		return login;
	}

	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement pswd() {
		return pswd;
	}

	public WebElement submit() {
		return submit;
	}
}
