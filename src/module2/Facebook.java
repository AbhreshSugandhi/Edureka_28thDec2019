package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//Open AUT
		driver.get("https://www.facebook.com/");
				
		//Interact with my elements on FB AUT using various Locator options
			//ID
			driver.findElement(By.id("u_0_m")).sendKeys("Abhresh");
		
			//Name
			driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
			
			//ClassName
			driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("Abhresh");
			
			driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("Sugandhi");
			
			//LinkText
			
			//navigate backward
			
			//PartialLinktext
			
			//CSS
			
			//TagName
			
			//Xpath
			

			
			
	}
}