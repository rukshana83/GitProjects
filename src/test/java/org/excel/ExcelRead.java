package org.excel;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		//configure
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\santh\\\\eclipse-workspace\\\\Selenium\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		//launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File f = new File("C:\\Users\\santh\\eclipse-workspace\\Selenium\\MavenOne\\Excel\\ExcelRead.xlsx");
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Data");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1)
				{
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+" ");
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat fo = new SimpleDateFormat("dd-MM-yyyy");
					String dateformat = fo.format(dateCellValue);
					System.err.print(dateformat+" ");
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					String numericvalue = String.valueOf(l);
					System.out.print(numericvalue+" ");
				}
			}
			System.out.println();
		}
	
		
	}

}
