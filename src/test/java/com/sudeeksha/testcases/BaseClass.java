package com.sudeeksha.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sudeeksha.testutilities.Read_Config;

public class BaseClass {
	
	Read_Config cf=new Read_Config();
	
	public static WebDriver driver;
	
	public  String BaseURL=cf.getURL();
	public  String Username=cf.getUsername();
	public  String Password=cf.getPassword();
	public static Logger logger;
	
	
	
	@BeforeClass
	public void SetUp()
	{
	
		logger=Logger.getLogger("/FinalAutomation2021/log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "/FinalAutomation2021/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(BaseURL);
		logger.info("url entered");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void Teardown()
	{
		driver.quit();
	}
	
	public void getScreenCapture(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(System.getProperty("user.dir")+ "/Screenshots/" +tname+ ".png");
		FileUtils.copyFile(src, tar);
	}
	
	public  String getRandom()
	{
		String email=RandomStringUtils.randomAlphanumeric(8);
		return email;
	}

}
