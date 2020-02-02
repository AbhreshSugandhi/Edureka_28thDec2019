package module10.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Browser Opened Successfully");
	}
	
	public static void Navigate() {
		
		driver.get("https://www.google.com/");
		
		System.out.println("AUT opened Successfully");
	
	}
	
	public static void ClickGmail() {
		
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println("Click action on Gmail Link is Successfully");
		
	}
}
