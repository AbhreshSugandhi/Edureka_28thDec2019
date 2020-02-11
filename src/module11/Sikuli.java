package module11;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Common.BrowserClass;

public class Sikuli extends BrowserClass {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		OpenBrowser("Chrome");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		
		Thread.sleep(5000);

		s.getScreen().click("C:\\Users\\abhre\\Pictures\\125.JPG");
		
	}

}
