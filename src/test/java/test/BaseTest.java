package test;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tools.Constants;

public class BaseTest {
	
	public WebDriver driver;
	String browser = Constants.BROWSER;
	String url = Constants.HOST;
	@Before
	public void setup(){
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_PATH);
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
