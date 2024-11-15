package pageobject_POM;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product_page_POM {
	
	WebDriver driver;
	
	public Product_page_POM(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
	public WebElement shortdropdown_box;
	@FindBy(xpath= "//*[@id=\"header_container\"]/div[2]/div/span/select")
	public List<WebElement> dropdownbox;
	
	Select select=new Select(shortdropdown_box);
	
	public void low_to_high() {
		
		select.deselectByVisibleText("Price (low to high)");
		}
	
}
