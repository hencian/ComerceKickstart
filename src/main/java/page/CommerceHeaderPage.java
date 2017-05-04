package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommerceHeaderPage extends AbstractPage{
	
	
	public CommerceHeaderPage(WebDriver driver){
		super(driver);
		
	}
	
	
	public void ClickLogin(){
		driver.findElement(By.cssSelector("li a[href=\"/user/login\"]")).click();
		
	}
}
