package com.dataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {

	public String[][] getData(int itr) throws IOException {
		
		File src=new File("C:\\Users\\m1047245\\Documents\\Modified Framework\\Book1_Enhanced.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(itr);
		
		String arr[][] = new String[12][4];
		for(int i = 0 ; i < sh1.getLastRowNum()+1 ; i++) {
			
			arr[i][0] = sh1.getRow(i).getCell(1).getStringCellValue();
			arr[i][1] = sh1.getRow(i).getCell(3).getStringCellValue();
			arr[i][2] = sh1.getRow(i).getCell(4).getStringCellValue();
			arr[i][3] = sh1.getRow(i).getCell(5).getStringCellValue();
		}
		return arr;
		
	}

	public String[][] getDatalogin(int itr) throws IOException {
		
		File src=new File("C:\\Users\\m1047245\\Documents\\Modified Framework\\Book1_Enhanced.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(itr);
		
		String arr1[][] = new String[12][4];
		for(int i = 0 ; i < sh1.getLastRowNum()+1 ; i++) {
			arr1[i][0] = sh1.getRow(i).getCell(1).getStringCellValue();
			arr1[i][1] = sh1.getRow(i).getCell(3).getStringCellValue();
			arr1[i][2] = sh1.getRow(i).getCell(4).getStringCellValue();
			arr1[i][3] = sh1.getRow(i).getCell(5).getStringCellValue();
		}
		
		for(int i =0;i<sh1.getLastRowNum()+1;i++) {
			System.out.println(".. "+arr1[i][0]);
		}
		return arr1;
		
	}

	public String[][] getDataTestCase2(int itr) throws IOException {
		
		File src=new File("C:\\Users\\m1047245\\Documents\\Modified Framework\\Book1_Enhanced.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(itr);
		
		String arr2[][] = new String[12][4];
		for(int i = 0 ; i < sh1.getLastRowNum()+1 ; i++) {
			
			arr2[i][0] = sh1.getRow(i).getCell(1).getStringCellValue();
			arr2[i][1] = sh1.getRow(i).getCell(3).getStringCellValue();
			arr2[i][2] = sh1.getRow(i).getCell(4).getStringCellValue();
			arr2[i][3] = sh1.getRow(i).getCell(5).getStringCellValue();
		}
		
		for(int i =0;i<sh1.getLastRowNum()+1;i++) {
			System.out.println(arr2[i][0]);
		}
		return arr2;
		
	}

}
