package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='input_error form_input'][@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@class='input_error form_input'][@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
