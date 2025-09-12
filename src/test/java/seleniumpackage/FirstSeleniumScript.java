package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
	//Here, Webdriver isan Interface and Chromedriver is a class
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //this statment used to maximize the browser
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
