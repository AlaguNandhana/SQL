package jatTask11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// topframe
		driver.findElement(By.xpath("//frame[@src='/frame_top']"));
		driver.switchTo().frame(0);
		Thread.sleep(3000);

		// count number of frames
		int topFrameCount = driver.findElements(By.tagName("frame")).size();
		if (topFrameCount == 3) {
			System.out.println("Three frames are found");
		} else {
			System.out.println("Three frames are not found");
		}

		// left frame

		driver.switchTo().frame("frame-left");
		String text1 = driver.findElement(By.tagName("body")).getText();
		if (text1.equals("LEFT")) {
			System.out.println(text1 + "frame");
		}
		driver.switchTo().parentFrame();

		// middle frame

		driver.switchTo().frame("frame-middle");
		String text2 = driver.findElement(By.id("content")).getText();

		if (text2.equals("MIDDLE")) {
			System.out.println(text2 + "frame");
		}
		driver.switchTo().parentFrame();

		// right frame
		driver.switchTo().frame("frame-right");
		String text3 = driver.findElement(By.tagName("body")).getText();
		if (text3.equals("RIGHT")) {
			System.out.println(text3 + "frame");
		}
		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		// bottom frame

		driver.switchTo().frame("frame-bottom");
		String text4 = driver.findElement(By.tagName("body")).getText();
		if (text4.equals("BOTTOM")) {
			System.out.println(text4 + "frame");
		}

		driver.quit();

	}

}
