package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
		List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons =" +radio.size());
		System.out.println(radio.get(0).isEnabled());
		System.out.println(radio.get(1).isDisplayed());
		System.out.println(radio.get(2).isSelected());
		
		String ExpectedResult = "radio 2";
		for(int i=0;i<radio.size();i++) {
		
		if(radio.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
		radio.get(i).click();
		System.out.println(ExpectedResult +"Clicked");
		break;
		}
		
	}

}
}