package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://en-gb.facebook.com/login/");
		//tag id
		driver.findElement(By.cssSelector("input#email")).sendKeys("test@gmail.com");
		//class
		driver.findElement(By.cssSelector("._42ft")).sendKeys("testing");
		//tag attribute
		
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		//tag class
		driver.findElement(By.cssSelector("._42ft[name='login']")).click();
		System.out.println("done");
		
		
	}

}
