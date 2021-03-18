package com.sudeeksha.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {
	
	public WebDriver idriver;
	
	public Loginpageobjects(WebDriver rdriver)
	{
		this.idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(how=How.NAME,using="uid")
	@CacheLookup
	WebElement custname;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement custpass;
	
	@FindBy(how=How.NAME,using="btnLogin")
	@CacheLookup
	WebElement custlogin;
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	WebElement custlogout;
	
	
	public void setUsername(String uname)
	{
		custname.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		custpass.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		custlogin.click();
	}
	
	public void setLogout()
	{
		custlogout.click();
	}
	

}
