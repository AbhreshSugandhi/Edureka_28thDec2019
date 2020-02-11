package module12;

import org.openqa.selenium.WebDriver;

public class HTMLUnitBrowser {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		
		// Open the AUT
		driver.get("https://www.amazon.in/");

		// Capture the Title of the Page
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);

		// validate the actual title VS Expected Title
		boolean Result = Apptitle.equals("Amazon.in");

		System.out.println(Result);

	}

}
