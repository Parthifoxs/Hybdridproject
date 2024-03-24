package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class Readxldata {


	   @DataProvider(name = "fetch")
		public static Object [][] readExcelData() throws IOException {
			FileInputStream file = new FileInputStream("C:\\Users\\navee\\eclipse-workspace\\New space\\HybridProject\\src\\test\\resources\\TestData\\Testdata1.xlsx");
			XSSFWorkbook wbook = new XSSFWorkbook(file);
			XSSFSheet sheet = wbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			Object [][] data = new String [rowCount][colCount];
			for (int i = 1; i <= rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					XSSFCell cell = row.getCell(j);
					String stringCellValue = cell.getStringCellValue();
					data[i-1][j] = stringCellValue;
				} 
			}
			wbook.close();
			return data;
		}
	}


