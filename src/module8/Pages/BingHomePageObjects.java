package module8.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	public BingHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sb_form_q")
	WebElement searchTxt;
	
	@FindBy(xpath = "//*[@name='q']//following::label[1]")
	WebElement searchBtn;	
	
	public void textSearch(String EnterText) {
		
		searchTxt.clear();
		searchTxt.sendKeys(EnterText);
		searchBtn.click();
		
	}
	
}
