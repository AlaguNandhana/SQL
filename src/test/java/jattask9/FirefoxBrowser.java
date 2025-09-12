package jattask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("Task completed on:"+driver.getCurrentUrl());
		driver.quit();
		
		
		

	}

}
