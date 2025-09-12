package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement list =driver.findElement(By.xpath("//select[@title='Year']"));
		Select year = new Select(list);
		
		year.selectByVisibleText("2024");
		
		year.selectByValue("2010");
		
		year.selectByIndex(5);
		
		System.out.println(year.getFirstSelectedOption().getText());
		
		List<WebElement> dropdown=year.getOptions();
		System.out.println("Total dropdown value: "+dropdown.size());
		 
		String ExpectedResult = "2000";
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				dropdown.get(i).click();
				System.out.println(ExpectedResult +"Selected");
				break;
			}
			
		}
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
