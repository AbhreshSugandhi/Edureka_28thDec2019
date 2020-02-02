package module10.TestCases;

import java.io.IOException;

import module10.Actions.ActionKeywords;
import module10.Utility.ExcelUtility;

public class Execution {

	public static void main(String[] args) throws IOException {
		
		String Path = "C:\\Users\\abhre\\eclipse-workspace\\Edureka_28thDec2019\\src\\module10\\TestData\\MyDataEngine.xlsx";

		ExcelUtility.SetExcel(Path, "Sheet1");
		
		for(int i=0; i<4; i++) 
		{
			String kw = ExcelUtility.getData(i, 1);
			if(kw.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			else if(kw.equals("Navigate"))
			{
				ActionKeywords.Navigate();	
			}
			else if(kw.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
	}

}
