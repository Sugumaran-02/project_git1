package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageobject_POM.browser_launch;
import pageobject_POM.login_objects;

public class login_stepdefinition {
	WebDriver driver;
	browser_launch browserlaunch=new browser_launch(driver);
	login_objects loginobjects;
	
	@Given("Tc1 open the browser2")
	public void tc1_open_the_browser2() {
		
		browserlaunch.browserlaunch();
		this.driver=browserlaunch.getdriver();
		
		
	}

	@When("^TC1 enter user (.*) and (.*)$")
	public void TC1_enter_user_username_and_password(String uname, String pwd) {
		loginobjects= new login_objects(driver);
		loginobjects.username.sendKeys(uname);
		loginobjects.password.sendKeys(pwd);
		
		
	}

	@When("TC1 user click login button2")
	public void tc1_user_click_login_button2() {
		loginobjects.login();
	}

	@Then("TC1 user verify")
	public void tc1_user_verify() {
	}

}
