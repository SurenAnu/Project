package com.dataDiven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Wright {
	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\SURENANU\\Desktop\\facebook.xlsx");
		Workbook book = new XSSFWorkbook(f);
		Sheet sh = book.getSheet("fb");
		Row ro = sh.createRow(5);
		Cell cell2 = ro.createCell(2);
		cell2.setCellValue("kumar@gmail.com");
		sh.getRow(5).createCell(3).setCellValue("12/12/2023");
		sh.getRow(5).createCell(3).setCellValue("password");
		Row createRow = sh.createRow(6);
		Cell createCell = createRow.createCell(2);
		createCell.setCellValue("kumar");
		FileOutputStream ff = new FileOutputStream("C:\\Users\\SURENANU\\Desktop\\facebook.xlsx");
		book.write(ff);
		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
