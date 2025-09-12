package javascriptExecutorExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("admin123");
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"')",userName);
		
		js.executeScript("arguments[0].setAttribute('value','admin123')",passWord);*/
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type ='submit']"));
		loginButton.click();
		
	
		//js.executeScript("arguments[0].click()", loginButton);
	
	}

}
