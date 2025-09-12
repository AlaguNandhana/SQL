package test;


	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import pages.OrmLoginpage;
import pages.OrmLoginpage1;

	public class Ormtestloginpage {

		static WebDriver driver;
		public static void main(String[]args ) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			testlogin();
		}
		
		static void testlogin( ) {
			OrmLoginpage1 log = new OrmLoginpage1(driver);
			log.setUserName("Admin");
			log.setPassword("admin123");
			log.clickLogin();
		}
	}


