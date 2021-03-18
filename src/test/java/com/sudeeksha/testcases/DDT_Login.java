package com.sudeeksha.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sudeeksha.pageobjects.Loginpageobjects;
import com.sudeeksha.testutilities.XLUtils;

public class DDT_Login extends BaseClass {
	
	@Test(dataProvider="LoginTest")
	public void loginDDT(String Sudeeksha,String Sai) throws InterruptedException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Sudeeksha);
		Thread.sleep(5000);
		lp.setPassword(Sai);
		Thread.sleep(5000);
		lp.clickLogin();
		Thread.sleep(5000);
		
		if(isAlertpresent()==true)
		{
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			lp.setLogout();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			
		}
	}
	
	public boolean isAlertpresent()
	{
		try{
		driver.switchTo().alert().accept();
		return true;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	
	@DataProvider(name="LoginTest")
	public String [][] getData() throws IOException
	{
		String path="/FinalAutomation2021/src/test/java/com/sudeeksha/testdata/LoginDataTest.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata [i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
