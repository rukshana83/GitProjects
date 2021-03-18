package org.excel;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\santh\\eclipse-workspace\\Selenium\\MavenOne\\Excel\\New.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Course");
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Java");
		w.write(fo);
	}

}
