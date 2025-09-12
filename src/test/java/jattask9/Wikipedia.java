package jattask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		
	
		driver.findElement(By.xpath("//span[text()='History']")).click();
		
	
		System.out.println("Page title after click: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();
	
		
	}

}
