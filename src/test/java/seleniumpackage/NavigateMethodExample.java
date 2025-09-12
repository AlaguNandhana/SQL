package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.guvi.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		//to go back
		driver.navigate().back();
		Thread.sleep(3000);
		//for forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//for refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		//close the browser
		driver.close();
		

	}

}
