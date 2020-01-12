package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
	

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the Simple Alert Button to generate the alert
		driver.findElement(By.xpath("//*[@id='prompt' and @onclick='promptBox()']")).click();
		
		Thread.sleep(5000);
			
		//Initialize the Alert class and switch the focus of webdriver towards the alert
		Alert pA = driver.switchTo().alert();

		//Type into the Alert Text box
		pA.sendKeys("Abhresh Sugandhi");

		//Click on Ok button on the ALert window
		pA.accept();
		
	}

}
