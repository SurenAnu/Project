package org.Data_Driven_FB_Base_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Base_Class {
	
	public static WebDriver driver;
	public void url(WebDriver d, String s) {
		d.get(s);
	}
	public static void sendkey(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void clk(WebElement e) {
		e.click();
	}
	public static String gettitle(WebDriver d) {
		String title = d.getTitle();
		return title;
	}
	public static String getcurrenturl(WebDriver d) {
		String currentUrl = d.getCurrentUrl();
		return currentUrl;
	}
	
	public static void excel(String filename, String sheetname,String returnvalue) throws IOException {
		File f = new File("C:\\Users\\SURENANU\\Desktop\\"+filename+".xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(sheetname);
		int PN = sheet.getPhysicalNumberOfRows();  System.out.println("numbers of row"+PN);
		String value= returnvalue;
			for (int i = 1; i < PN; i++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(i);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					 value = cell.getStringCellValue();
				} 
				else if(cellType.equals(CellType.NUMERIC)){
                       double cellValue = cell.getNumericCellValue();
                       int re =(int) cellValue;
                       value = String.valueOf(re);
                       
				}
			}}
	public static String getexcel(String filename, String sheetname, int ro,int ce) throws IOException {
		File f = new File("C:\\Users\\SURENANU\\Desktop\\"+filename+".xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(sheetname);
		String value= "";
				Row row = sheet.getRow(ro);
				Cell cell = row.getCell(ce);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					 value = cell.getStringCellValue();
				} 
				else if(cellType.equals(CellType.NUMERIC)){
                       double cellValue = cell.getNumericCellValue();
                       int re =(int) cellValue;
                       value = String.valueOf(re);
                       
				}
				return value;
			}

	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
	


