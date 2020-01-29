package module8.TestCase;

import Common.BrowserClass;
import module8.Pages.BingHomePageObjects;

public class EdurekaSearch extends BrowserClass{
	
	public static void main(String[] args) {
		
		OpenBrowser("Chrome");
		
		driver.get("https://www.bing.com");
		
		BingHomePageObjects page = new BingHomePageObjects(driver);
		
		page.textSearch("Edureka");		
		
	}
}
