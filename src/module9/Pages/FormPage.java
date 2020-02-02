package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	public FormPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "ts_first_name")
	WebElement FirstName;
	
	@FindBy(name="ts_last_name")
	WebElement LastName;
	
	@FindBy(id="ts_address")
	WebElement Address;

	public void FormFill(String FName, String LName, String Add) throws InterruptedException {

		FirstName.clear();
		FirstName.sendKeys(FName);
		
		LastName.clear();
		LastName.sendKeys(LName);
		
		Address.clear();
		Address.sendKeys(Add);
		
		Thread.sleep(5000);
	}
	
	
}
