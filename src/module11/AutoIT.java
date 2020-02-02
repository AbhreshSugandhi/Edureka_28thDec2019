package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Common.BrowserClass;

public class AutoIT extends BrowserClass{

	public static void main(String[] args) throws Exception{
		
		OpenBrowser("Chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).sendKeys("30112020");
		
		//driver.findElement(By.xpath("//*[@id=\"photo\"]")).click();
				
		Thread.sleep(7000);
		
		Runtime.getRuntime().exec("C:\\Users\\abhre\\eclipse-workspace\\Edureka_28thDec2019\\AutoIT & Sikuli\\Sample.exe");
		
	}

}
