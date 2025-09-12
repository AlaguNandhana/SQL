package jattask10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.id("droppable"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();

		String droppedText = target.getText();
		if (droppedText.equals("Dropped!")) {
			System.out.println("Drag and Drop Successful!");
		} else {
			System.out.println("Drag and Drop Failed!");
		}

		String bgcolour = target.getCssValue("background-color");
		System.out.println("Target Background Colour: " + bgcolour);

		if (bgcolour.contains("255, 250, 144")) {
			System.out.println("Background colour is yellow");
		} else {
			System.out.println("Unknown");
		}

		driver.quit();

	}
}
	
	
	
	
	
	
	

