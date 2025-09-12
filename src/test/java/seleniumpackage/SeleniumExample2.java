package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		
		String title1 = driver.getTitle();
		System.out.println(driver.getTitle());
		String title2 = "GUVI | Learn to code in your native language";
		
		if (title1.equals(title2)) {
			System.out.println("Title is matched");
		}else {
			System.out.println("Title is not matched");
		}
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
