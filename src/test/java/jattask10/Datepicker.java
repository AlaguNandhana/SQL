package jattask10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		WebElement frame1 =driver.findElement(By.xpath("//iframe[@src='/resources/demos/datepicker/default.html']"));
		driver.switchTo().frame(frame1);
		
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		
		
		WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement selectDate = driver.findElement(By.xpath("//a[text()='22']"));
		selectDate.click();
		
		WebElement selectMonth=driver.findElement(By.xpath("//span[text()='October']"));
		selectMonth.click();
		
		String expectedDate=datePicker.getAttribute("value");
		System.out.println("Expected Date :"+expectedDate);
		
		driver.quit();	

	}
}
