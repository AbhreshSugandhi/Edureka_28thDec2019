package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		
		// Part1
		//to get the window name of the main window
		String mwn = driver.getWindowHandle();

		System.out.println(mwn);
		System.out.println("=============================================================");
		
		// Part2
		//Click on the button to generate a new window so that I can have two windows opened with this instance
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
				
		//to get the names of all the opened windows
		Set<String> awn = driver.getWindowHandles();
		
		System.out.println(awn);
		System.out.println("=============================================================");
		
		// Part3
		//to switch between both the windows but without assigning a container for it - for loop

		for(String AWN : driver.getWindowHandles()) // we are getting two window names and we are using those values one by one to switch between them.
		{
			
			Thread.sleep(5000);
			//B is my active window and I will switch between the windows and here I will switch to A window from B window
			driver.switchTo().window(AWN);//moving the focus of webdriver from B window to A window
			
			Thread.sleep(3000);
			
			driver.switchTo().window(AWN); //moving the focus of webdriver from A window to B window
			
			Thread.sleep(3000);
		}
		
		driver.close();
		
	}

}







