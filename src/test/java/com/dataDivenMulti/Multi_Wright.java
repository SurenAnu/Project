package com.dataDivenMulti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multi_Wright {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("C:\\Users\\SURENANU\\Desktop\\ABCD.xlsx");
		Workbook book = new XSSFWorkbook(input);
		Sheet s = book.getSheetAt(0);
		
int no_of_rows = s.getPhysicalNumberOfRows();


		    for (int i = 0; i <no_of_rows ; i++) {
			Row row = s.getRow(i);
			
int no_of_cells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < no_of_cells; j++) {
				Cell cell = row.getCell(j);
				
				CellType ct = cell.getCellType();
			
				
				if (ct.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (ct.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int q =(int) cellValue;
					//String valueOf = String.valueOf(i);
					System.out.println(q);
				}
				
					
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}}
