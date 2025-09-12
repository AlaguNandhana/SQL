package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrmLoginpage {
	
	WebDriver driver;
	
	public OrmLoginpage(WebDriver driver) {
		this.driver= driver;
		
	}
		 By userName = By.name("username");
		 By userPass = By.name("password");
		 By loginButton= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
		 

		 public void setUserName(String user) {
			 driver.findElement(userName).sendKeys(user);
		 }
		 public void setPassword(String pass) {
			 driver.findElement(userPass).sendKeys(pass);
		 }
		 public void clickLogin() {
			 driver.findElement(loginButton).click();
		 }
		 
}






