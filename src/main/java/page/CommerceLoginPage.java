package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommerceLoginPage extends AbstractPage{
	
	
	public CommerceLoginPage(WebDriver driver){
		super(driver);
	}
	
	public void login(String username,String password){
		WebElement usernameInput = driver.findElement(By.id("edit-name"));
		usernameInput.clear();
		usernameInput.sendKeys(username);
		
		WebElement passwordInput = driver.findElement(By.id("edit-pass"));
		passwordInput.clear();
		passwordInput.sendKeys(password);
		
	}
	
	public void ClickLoginButton(){
		driver.findElement(By.id("edit-submit")).click();
	}
}
