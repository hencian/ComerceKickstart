package test;

import org.junit.Test;

import page.CommerceHeaderPage;
import page.CommerceLoginPage;
import tools.Constants;

public class LoginTest extends BaseTest {

	String username = Constants.USERNAME;
	String password = Constants.PASSWORD;

	@Test
	public void Login() {

		CommerceHeaderPage headerPage = new CommerceHeaderPage(driver);
		CommerceLoginPage loginPage = new CommerceLoginPage(driver);

		headerPage.ClickLogin();
		loginPage.login(username, password);
		loginPage.ClickLoginButton();
	}

}
