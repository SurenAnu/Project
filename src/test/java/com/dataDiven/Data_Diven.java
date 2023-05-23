package com.dataDiven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_Diven {
	
	public static void main(String[] args) throws IOException {
		
		File F = new File ("C:\\Users\\SURENANU\\Desktop\\facebook.xlsx");
		FileInputStream in= new FileInputStream(F);
		Workbook book = new XSSFWorkbook(in);
		Sheet sh = book.getSheetAt(0);
		Row row = sh.getRow(1);
		
		Cell cell = row.getCell(1);
		System.err.println("cell value"+cell);
		CellType CT = cell.getCellType();
		System.err.println("row value"+CT);
		
		if (CT.equals(CellType.STRING)) {
			String sv = cell.getStringCellValue();
			System.out.println(sv);
		}
		else if (CT.equals(CellType.NUMERIC)) {
			double nv = cell.getNumericCellValue();
			System.out.println(nv);
			int i = (int) nv;
			System.out.println(i);
			String valueOf = String.valueOf(i);
			System.out.println(valueOf);
			
			
			
			
		}
		
}}
