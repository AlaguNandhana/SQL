package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrmLoginpage1 {
	WebDriver driver;
	
	public OrmLoginpage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="username")
	WebElement  userName;
	
	@FindBy(name ="password")
	WebElement  userPass;
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement  loginButton;
	

	 public void setUserName(String user) {
		userName.sendKeys(user);
	 }
	 public void setPassword(String pass) {
		userPass.sendKeys(pass);
	 }
	 public void clickLogin() {
		loginButton.click();
	 }
	
	}

