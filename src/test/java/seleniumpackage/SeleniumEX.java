package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEX {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		 System.out.println(" done!");
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Submit your talk")).click();
		 System.out.println(" Again done!");
		 driver.quit();
		 
	}

}
