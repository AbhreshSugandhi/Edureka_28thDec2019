package module8.TestCase;

import Common.BrowserClass;
import module9.Pages.FormPage;

public class FormValidation extends BrowserClass{

	public static void main(String[] args) throws InterruptedException {
		
		OpenBrowser("Chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		FormPage fp = new FormPage(driver);
		
		fp.FormFill("Abhresh", "Sugandhi", "Pune");

		Thread.sleep(5000);

		driver.quit();
		
	}

}
