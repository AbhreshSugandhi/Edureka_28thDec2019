package module9.TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.FormPage;

public class DDT{

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	
	@BeforeSuite
	public void Open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
	}
	

	@Test(dataProvider = "testDataFeed")
	public void FormFill(String FName, String LName, String Add) throws InterruptedException {
		
		FormPage page = new FormPage(driver);
		
		page.FormFill(FName, LName, Add);
		
	}
	
	@DataProvider
	public Object[][] testDataFeed() throws IOException{
		
		//To pass the path of the file and start using it
		FileInputStream fis = new FileInputStream("C:\\Users\\abhre\\git\\Edureka_31August\\src\\module9\\TestData\\TestData.xlsx");
		
		//To open the workbook
		wb = WorkbookFactory.create(fis);
		
		//To define the sheet to interact with
		sh = wb.getSheet("Sheet1");
		
		//To calculate the total no of rows and columns
		
		norows = sh.getLastRowNum()+1;//9+1=10
		
		nocols = sh.getRow(0).getLastCellNum();//2+1=3
		
		Object[][] formData =  new Object[norows][nocols];
		
		/*
		 * to create a loop so that we can run the data of rows and columns
		 * to read each and every cell value one by one and
		 * pass them into the @Test annotation and that data will be passed on to\
		 * every String one by one and which will help in executing the test on the AUT
		 */
		
		for(int row=0; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++)
			{
				//Fetch the data from the combo of rows and columns and read the data from the cell
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
	}
	
	
	
}











