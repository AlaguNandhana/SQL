package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testform {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Welome-Pc/Downloads/RegistrationForm.html");
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.name("email")).sendKeys("johnsm@testmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.name("address")).sendKeys("xyz street");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("state")).sendKeys("Tamilnadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("username")).sendKeys("johnsm");
		driver.findElement(By.id("password")).sendKeys("john@123");
		driver.findElement(By.id("confirmPassword")).sendKeys("john@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Registration successful!!"+driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
