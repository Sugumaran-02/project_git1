package pageobject_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class browser_launch {
WebDriver driver;

public browser_launch(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}

public void browserlaunch() {
	driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugum\\Documents\\Selenium\\chromedriver-win64\\chromedriver.exe");
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public WebDriver getdriver() {
	return driver;
	
}
	
	
}
