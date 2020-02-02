package module11;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Common.BrowserClass;

public class Sikuli extends BrowserClass {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		OpenBrowser("Chrome");
		
		driver.get("https://www.instagram.com/");
		
		Screen s = new Screen();
		
		Thread.sleep(5000);

		Pattern ClickLogin = new Pattern("C:\\Users\\abhre\\eclipse-workspace\\Edureka_28thDec2019\\AutoITSikuli\\Capture1.JPG");
		
		Pattern enterEmail = new Pattern("C:\\Users\\abhre\\eclipse-workspace\\Edureka_28thDec2019\\AutoITSikuli\\Capture2.JPG");
		
		s.click(ClickLogin);
		
		s.type(enterEmail, "Edureka");
		
	}

}
