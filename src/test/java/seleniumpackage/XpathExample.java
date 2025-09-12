package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement( By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' ]")).click();
		Thread.sleep(3000);
		
	//	driver.findElement( By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header' ]")).click();
		
		driver.quit();
	}
	
}