package com.luma.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private Properties pro;
	public ReadConfig()
	{
		String path = "D:\\Workspace\\eclipse-workspace\\LumaProject27Aug\\src\\test\\resources\\config\\Config.properties";
		File file = new File(path);
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getApplicationUrl()
	{
		String URL = pro.getProperty("url");
		return URL;
	}
	
	public String getUsername()
	{
		String URL = pro.getProperty("username");
		return URL;
	}
	
	public String getPassword()
	{
		String URL = pro.getProperty("password");
		return URL;
	}
}
