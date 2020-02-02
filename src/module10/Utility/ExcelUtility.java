package module10.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;

	public static void SetExcel(String Path, String SheetName) throws IOException {

		FileInputStream fis = new FileInputStream(Path);

		wb = WorkbookFactory.create(fis);

		sh = wb.getSheet(SheetName);
	}

	public static String getData(int rownum, int colnum) {

		String data = sh.getRow(rownum).getCell(colnum).toString();

		return data;

	}
}
