package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {

	public static void main(String[] args) {
		// Open Chrome Browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement element = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(element);

		//driver.switchTo().frame(0);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
	}

}
