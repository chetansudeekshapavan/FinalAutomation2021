package com.sudeeksha.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpageobjects {
	
	public WebDriver ldriver;
	
	public Registrationpageobjects(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement newcust;
	@FindBy(how=How.NAME,using="name")
	@CacheLookup
	WebElement custname;
	@FindBy(how=How.NAME,using="dob")
	@CacheLookup
	WebElement custdob;
	@FindBy(how=How.NAME,using="addr")
	@CacheLookup
	WebElement custaddr;
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement custcity;
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement custstate;
	@FindBy(how=How.NAME,using="pinno")
	@CacheLookup
	WebElement custpinno;
	@FindBy(how=How.NAME,using="telephoneno")
	@CacheLookup
	WebElement custtelephoneno;
	@FindBy(how=How.NAME,using="emailid")
	@CacheLookup
	WebElement custemailid;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement custpassword;
	@FindBy(how=How.NAME,using="sub")
	@CacheLookup
	WebElement custsub;

	
	public void setNewcust()
	{
		newcust.click();
	}
	
	public void setnewcustname(String name)
	{
		custname.sendKeys(name);
	}
	public void setcustday(String day)
	{
		custdob.sendKeys(day);
	}
	public void setcustmon(String mon)
	{
		custdob.sendKeys(mon);
	}
	public void setcustyear(String year)
	{
		custdob.sendKeys(year);
	}
	public void setcustaddr(String addr)
	{
		custaddr.sendKeys(addr);
	}
	public void setcustcity(String cty)
	{
		custcity.sendKeys(cty);
	}
	public void setcuststate(String state)
	{
		custstate.sendKeys(state);
	}
	public void setcustpin(String pin)
	{
		custpinno.sendKeys(pin);
	}
	public void setcustpno(String pno)
	{
		custtelephoneno.sendKeys(pno);
	}
	public void setcustemail(String email)
	{
		custemailid.sendKeys(email);
	}
	public void setcustpass(String pass)
	{
		custpassword.sendKeys(pass);
	}
	public void setcustsub()
	{
		custsub.click();
	}
}
