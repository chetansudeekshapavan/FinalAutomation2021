package com.sudeeksha.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sudeeksha.pageobjects.Loginpageobjects;

public class LoginTestcase extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException, IOException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Username);
		logger.info("username entered");
		Thread.sleep(5000);
		lp.setPassword(Password);
		logger.info("password entered");
		Thread.sleep(5000);
		lp.clickLogin();
		logger.info("login clicked");
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank####"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreenCapture(driver, "LoginTest");
			Assert.assertTrue(false);
		}
	}

}
