package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/sign-in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String filepath = System.getProperty("user.dir")+"/guvitestdata/testdata.xlsx";
		int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i=1;i<=rows;i++) {
			String username = String.valueOf(ExcelUtils.getCellData(filepath, "Sheet1", i, 0));
			String password = String.valueOf(ExcelUtils.getCellData(filepath, "Sheet1", i, 1));
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			
		}
		//validattion
		String Exp = driver.getTitle();
		
		if (driver.getTitle().equalsIgnoreCase(Exp)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}	
			

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		System.out.println(Exp);
	}
			
			
			//only first row value is read , next value is read by the loop
			
		}
		
		
		

	


