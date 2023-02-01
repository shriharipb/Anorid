package com.luma.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private String path = "D:\\Workspace\\eclipse-workspace\\LumaProject27Aug\\src\\test\\resources\\testData\\TestData1.xlsx";
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public String readData(String sheet_name,int row_num,int cell_num)
	{
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);	
		} 
		catch (IOException e)
		{
			System.out.println("Please check path");
			e.printStackTrace();
		}
		
//		String data = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sheet.getRow(row_num).getCell(cell_num));
		
		return data;
	}
	
	
	
}
