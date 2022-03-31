package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.yahooHome;

public class Test1 {
	WebDriver driver;
	
	@BeforeTest
	public void AtBefore() {
		
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", ProjectPath+"\\Driver\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void atTest() {
		yahooHome yH = new yahooHome(driver);
		yH.SignIN_Click();
		System.out.println("Clicked on SignIn button");
		
		
		
	}

}
