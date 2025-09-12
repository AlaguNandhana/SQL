package jattask10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUpPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");

		WebElement signUpButton = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signUpButton.click();

		WebElement fullName = driver.findElement(By.xpath("//input[@ id='name']"));
		fullName.sendKeys("Johnny");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("logintestpage@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("testmail@123");

		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobileNumber.sendKeys("9786543210");

		WebElement submitButton = driver.findElement(By.xpath("//a[@id='signup-btn']"));
		submitButton.click();

		String GuvilLoginPage = driver.getTitle();
		if (GuvilLoginPage.equals("Guvi login")) {
			System.out.println("login Successful!");
		} else {
			System.out.println("login Failed!");
		}

		driver.quit();
	}
}
