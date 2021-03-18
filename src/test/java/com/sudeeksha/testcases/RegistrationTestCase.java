package com.sudeeksha.testcases;

import org.testng.annotations.Test;

import com.sudeeksha.pageobjects.Loginpageobjects;
import com.sudeeksha.pageobjects.Registrationpageobjects;

public class RegistrationTestCase extends BaseClass {
	
	@Test
	public void RegistrationTest() throws InterruptedException
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
		
		Registrationpageobjects ro=new Registrationpageobjects(driver);
		ro.setNewcust();
		Thread.sleep(5000);
		ro.setnewcustname("pavanchetansudeeksha");
		Thread.sleep(5000);
		ro.setcustday("24");
		Thread.sleep(5000);
		ro.setcustmon("08");
		Thread.sleep(5000);
		ro.setcustyear("1986");
		Thread.sleep(5000);
		ro.setcustaddr("VNK");
		Thread.sleep(5000);
		ro.setcustcity("hyd");
		Thread.sleep(5000);
		ro.setcuststate("AP");
		Thread.sleep(5000);
		ro.setcustpin("522647");
		Thread.sleep(5000);
		ro.setcustpno("8328610590");
		Thread.sleep(5000);
		ro.setcustemail(getRandom()+"@gmail.com");
		Thread.sleep(5000);
		ro.setcustpass("test123");
		Thread.sleep(5000);
		ro.setcustsub();
		Thread.sleep(5000);
	}

}
