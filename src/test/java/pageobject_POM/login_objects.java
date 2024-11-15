package pageobject_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_objects {
	WebDriver driver;
	
	public login_objects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement login_btn;
	
//	public void username() {
//		username.sendKeys("standard_user");
//	}
//	
//	public void password() {
//		password.sendKeys("secret_sauce");
//	}
	
	public void login() {
		login_btn.click();
		
	}

}
