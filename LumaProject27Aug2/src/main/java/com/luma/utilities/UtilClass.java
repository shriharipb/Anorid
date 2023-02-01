package com.luma.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class UtilClass extends TestBase{

	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void takeSS(String filename)
	{
		String path = "D:\\Workspace\\eclipse-workspace\\LumaProject27Aug\\screenshots\\";
		
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("File not found - Please provide correct path");
			e.printStackTrace();
		}
	}
	
}
