package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

		public static void main(String[] args) throws InterruptedException {
			
		
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.getTitle();
			Thread.sleep(3000);
			
			driver.navigate().to("https://www.selenium.dev/");
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			driver.quit();
			
			
			
			
		/*	driver.get("https://www.selenium.dev/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(2000); */
		
		}

	}
