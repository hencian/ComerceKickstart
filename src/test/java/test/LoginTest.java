package test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.CommerceHeaderPage;
import page.CommerceLoginPage;
import tools.Constants;

public class LoginTest extends BaseTest{
	
	
	String username = Constants.USERNAME;
	String password = Constants.PASSWORD;
	
	
	
	@Test
	public void Login(){

//		System.setProperty("webdriver.firefox.marionette", "/./drivers/geckodriver.exe");
		
		CommerceHeaderPage headerPage = new CommerceHeaderPage(driver);
		CommerceLoginPage loginPage = new CommerceLoginPage(driver);

		headerPage.ClickLogin();
		loginPage.login(username, password);
		loginPage.ClickLoginButton();
	}
	
}
