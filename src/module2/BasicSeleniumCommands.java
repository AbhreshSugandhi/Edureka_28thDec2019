package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {

		// Single Line Comment
		/*
		 * Multiline Comment
		 */

		// Instantiate a Browser - Open Browser
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox Browser
		System.setProperty("webdriver.gecko.driver",
 				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		// Quit & Close
		driver.quit(); // this will close all the windows opened during the current instance and will also close the driver.exe from the taskbar
		driver.close(); // this will close only the current active window

		// Get Commands
		driver.get("URL");// to open URL of the AUT on the Browser
		driver.getTitle();// to get the title of the current page
		driver.getCurrentUrl();// to get the current page url
		driver.getWindowHandle(); // to get the name of the window

		// Navigation Commands
		driver.navigate().back();// previous page from the history
		driver.navigate().forward(); // Next page from the history
		driver.navigate().refresh(); // Page refresh

		// Element Handling
		driver.findElement(By.id("")).click();// to click - button, link, checkbox, radiobutton.
		driver.findElement(By.id("")).sendKeys("Abhresh");// to type into a text box
		driver.findElement(By.id("")).clear();// to erase everything from a text box
		driver.findElement(By.id("")).getText(); // to get the text from a location
	}
}