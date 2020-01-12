package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// Initialize the Select Class and Navigate to the dropdown element
		Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));

		Thread.sleep(5000);
		
		//Part 1
		//select element using index value
		oSelect.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//deslect element using Visibile Text
		oSelect.deselectByVisibleText("Switch Commands");
		
		
		Thread.sleep(5000);
		
		//Part2
		//to run the loop to select & deslect all the options one by one
		List<WebElement> oList = oSelect.getOptions();
		
		//Get the count of total options available which will allow me to use the for loop to run through selecting and deselect
		int oListTotal = oList.size();
		
		//Start the loop where I am going to select and deselect options one by one with a small pause for convenience
		
		for(int i=0; i<oListTotal; i++) 
		{
			//to get the text of the options available
			String oValue = oList.get(i).getText();
			
			//Print the text
			System.out.println(oValue);
			
			//Select options based on index values
			oSelect.selectByIndex(i);
			
			Thread.sleep(5000);
			/*
			//Deselect options based on index values
			oSelect.deselectByIndex(i);
			
			Thread.sleep(5000);
			*/
		}
		
		//Deselect all the options in one go
		oSelect.deselectAll();		
	}

}








