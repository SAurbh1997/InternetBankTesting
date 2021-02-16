package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;

	@CacheLookup
	@FindBy(how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "rad1")
	WebElement rdGender;
	
	@CacheLookup
	@FindBy(how =How.ID_OR_NAME, using = "dob")
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(how =How.NAME, using = "addr")
	WebElement txtaddress;
	
	@CacheLookup
	@FindBy(how = How.NAME , using ="city")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(how = How.NAME , using="state")
	WebElement txtState;
	
	@CacheLookup
	@FindBy(how =How.NAME , using ="pinno")
	WebElement txtpinno;
	
	@CacheLookup
	@FindBy(how =How.NAME , using ="telephoneno")
	WebElement txttelephoneno;
	
	
	@CacheLookup
	@FindBy(how = How.NAME , using="emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME , using="password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME , using="sub")
	WebElement txtbtnSubmit;

	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
		
	}
	
	public void custName(String cname) {
		
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender (String cgender) {
		
		rdGender.click();
	}
	
	public void custdob(String dd,String mm,String yyyy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yyyy);
		
	}
	
	public void custaddress(String caddress) {
		
		txtaddress.sendKeys(caddress);
		
	}
	
	public void custcity(String ccity) {
		
		txtCity.sendKeys(ccity);
	}
	
	public void custstate(String cstate) {
		
		txtState.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno) {
		
		txtpinno.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephoneno(String ctelephoneno) {
		
		txttelephoneno.sendKeys(ctelephoneno);
	}
	
	public void custemailid(String cemailid) {
		
		txtemailid.sendKeys(cemailid);
	}
	
	public void custpassword(String cpassword) {
		
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		txtbtnSubmit.click();
			}

}
