package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(login);
		actions.build().perform();
		System.out.println("Done");
		Thread.sleep(3000); */
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // 2. Open the website
	        driver.get("https://demoqa.com/menu/");

	        // 3. OBJECTS: Locating elements (WebElement = an object)
	        WebElement mainMenu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	        WebElement subMenu = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));

	        // 4. ACTIONS: Performing interactions on objects
	        Actions actions = new Actions(driver);

	        // Hover over main menu
	        actions.moveToElement(mainMenu).perform();

	        // Hover over sub menu and click it
	        actions.moveToElement(subMenu).click().perform();
			actions.build().perform();
	        // Close the browser
			System.out.println("Done");
	        driver.quit();
		
	
		
	
	}

}
