package com.shashi.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelConfig {
	XSSFWorkbook wb;
	String filePath ;
	
	public ExcelConfig(String filePath)
	{
		try {
			   File file = new File(filePath);
			   FileInputStream fis = new FileInputStream(file);
			   // Load workbook
			   wb=new XSSFWorkbook(fis);
		} catch (Exception e) {	
			   e.printStackTrace();
		}	
	}
	
	public String getData(String sheetName,int row,int col)
	{
		XSSFSheet sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public String[][] getAllData(String sheetName)
	{
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String [][]data = new String[rowCount][cellCount];
		//System.out.println("rowCount:"+rowCount);
		//System.out.println("cellCount:"+cellCount);
		for(int row=1;row<=rowCount;row++)
		{			
			for(int cell=0;cell<cellCount;cell++)
			{
				data[row-1][cell]=sheet.getRow(row).getCell(cell).getStringCellValue();
				//System.out.println("cellData: "+data[row-1][cell]);
			}			
		}
		
		return data;
	}
	
	public String[][] getAllData(int sheetPosition)
	{
		XSSFSheet sheet = wb.getSheetAt(sheetPosition);		
		int rowCount = sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String [][]data = new String[rowCount][cellCount];
		System.out.println("rowCount:"+rowCount);
		System.out.println("cellCount:"+cellCount);
		for(int row=1;row<=rowCount;row++)
		{			
			for(int cell=0;cell<cellCount;cell++)
			{
				data[row-1][cell]=sheet.getRow(row).getCell(cell).getStringCellValue();
				System.out.println("cellData: "+data[row-1][cell]);
			}			
		}
		return data;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		wb.close();
	}
}
