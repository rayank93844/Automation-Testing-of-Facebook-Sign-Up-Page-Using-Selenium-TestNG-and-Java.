package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream("E:\\download\\selenium library\\Facebook Testcases.xlsx"));
		
		XSSFSheet sheet = wb.getSheet("FB Sign Up TestCases");
		
		
		for (int i = 7; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {
				
				XSSFCell cell = row.getCell(j);
				
				 String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
				
				
			}
		}
		
		
		
		
		
		
		

			
		}
}
