package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		// frame1 
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String text1 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		//frame 2
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='page.xhtml']']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//button[@onclick='change()']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.quit();
		
	}		
		
}
