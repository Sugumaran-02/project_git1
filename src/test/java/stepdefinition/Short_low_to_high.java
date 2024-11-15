package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageobject_POM.Product_page_POM;
import pageobject_POM.browser_launch;
import pageobject_POM.login_objects;

public class Short_low_to_high {
	
	WebDriver driver;
	browser_launch browserlaunch1=new browser_launch(driver);
	Product_page_POM productpage1;
	login_objects loginobjects1;
	
	@Given("TC02 open the browser2")
	public void TC02_open_the_browser2() {
		browserlaunch1.browserlaunch();
		this.driver=browserlaunch1.getdriver();
		
	}
	
	@When("^TC02 enter user (.*) and (.*) and login$")
	public void TC02_enter_user_username1_and_password1_and_login(String uname, String pwd) {
       loginobjects1= new login_objects(driver);
        loginobjects1.username.sendKeys(uname);
        loginobjects1.password.sendKeys(pwd);
        loginobjects1.login();
		
	}
	
	@And("TC02 Select short order price low to high")
	public void TC02_Select_short_order_price_low_to_high() {
		productpage1=new Product_page_POM(driver);
		productpage1.low_to_high();
		
	}
	
	@Then("TC02 Click logout")
	public void TC02_Click_logout() {
		loginobjects1.logout();
		
	}
	

}
