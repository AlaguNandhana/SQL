package jattask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "STORE";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page landed on Correct Website");
		} else {
			System.out.println("Page not landed on Correct Website");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
