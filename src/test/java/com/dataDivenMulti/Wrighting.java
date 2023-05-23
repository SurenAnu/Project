package com.dataDivenMulti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrighting {
	public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\SURENANU\\Desktop\\sheet.xlsx");
	Workbook book = new XSSFWorkbook(file);
	//we can use current sheet 
	//book.cloneSheet(0);
		Sheet sheet = book.createSheet("Empolyee details ");
		book.getSheet("Empolyee details ").createRow(0).createCell(0).setCellValue("Name");
		book.getSheet("Empolyee details ").getRow(0).createCell(1).setCellValue("E-Mail");
		book.getSheet("Empolyee details ").createRow(1).createCell(0).setCellValue("Anbu");
		book.getSheet("Empolyee details ").getRow(1).createCell(1).setCellValue("Anbu@gmail.com");
		FileOutputStream out = new FileOutputStream("C:\\Users\\SURENANU\\Desktop\\sheet.xlsx");
book.write(out);
System.out.println("success");
book.close();
}}
