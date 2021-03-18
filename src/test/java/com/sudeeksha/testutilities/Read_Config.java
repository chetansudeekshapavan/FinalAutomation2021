package com.sudeeksha.testutilities;

import java.io.FileInputStream;

import java.util.Properties;

public class Read_Config {
	
	Properties pro;
	public Read_Config()
	{
		try {
			FileInputStream fis=new FileInputStream("/FinalAutomation2021/Properties/Config.properties");
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public String getURL()
	{
		String url=pro.getProperty("BaseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
		
	}
	
	public String getChropath()
	{
		String chropath=pro.getProperty("Chropath");
		return chropath;
	}

}
