package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample1 {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement sourcedrag = driver.findElement(By.id("column-a"));
			WebElement targetdrop = driver.findElement(By.id("column-b"));
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			actions.dragAndDrop(sourcedrag, targetdrop);
			actions.build().perform();
			System.out.println("Done");
			Thread.sleep(3000);
		
	}

}
