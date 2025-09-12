package jatTask11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement clickButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
		String originalWindow = driver.getWindowHandle();
		 System.out.println("Original WindowHandle :"+originalWindow);
		clickButton.click();
		
		Thread.sleep(3000);
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> set = new ArrayList<String>(windowhandles);
		driver.switchTo().window(set.get(1));
		System.out.println(driver.getTitle());
		
		WebElement newWindow= driver.findElement(By.xpath("//h3[text()='New Window']"));
		
		if(newWindow.isDisplayed()) {
			System.out.println("Verification Passed: 'New Window' text is present");
		} else {
			System.out.println("Verification failed: 'New Window' text is not present");
			
		}
		driver.close();
		
		driver.switchTo().window(originalWindow); // switching back to original window
		
		String currentUrl = driver.getCurrentUrl();
				
		
		if (currentUrl.equals("https://the-internet.herokuapp.com/windows")) {
			System.out.println("Verification Passed: Original Window is active");
		}else {
			System.out.println("Verification failed: Original Window isnot active");
		}
			driver.quit();
		
	}

}
