package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
	

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Click on the Simple Alert Button to generate the alert
		driver.findElement(By.xpath("//*[@id='confirm' and @onclick='confirmBox()']")).click();
		
		//Initialize the Alert class and switch the focus of webdriver towards the alert
		Alert cA = driver.switchTo().alert();

		//Get the text of the Alert and print into the console pannel
		System.out.println(cA.getText());
		
		//Click on Ok button on the ALert window
		cA.dismiss();
		
	}

}
