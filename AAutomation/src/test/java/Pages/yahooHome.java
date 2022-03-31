package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class yahooHome {
	
	WebDriver driver;
	By SignIn_Button = By.xpath("//a[@class='_yb_1xhns']");
	
	public yahooHome(WebDriver driver){
		this.driver = driver;
	}

	public void SignIN_Click() {
		
		driver.get("https://au.yahoo.com/?p=us");
		driver.findElement(SignIn_Button).click();
	}
}
