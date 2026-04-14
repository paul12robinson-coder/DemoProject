package org.pmr.automation.pr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.pmr.automation.pr.utility.ReadProperties;

public class RegistrationPage 
{

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) 
	{
		this.driver=driver;
				
	}
	
	public void click_register_newId () throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("login_new_registration_xpath"))).click();
		
	}
	
	public void enter_fullname (String fname) throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("register_fullname_css"))).sendKeys(fname);
		
	}
	
	public void enter_email (String email) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_email_xpath"))).sendKeys(email);
		
	}
	
	public void enter_choose_passwd (String cpasswd) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_choose_passwd_xpath"))).sendKeys(cpasswd);
		
	}
	
	public void enter_retype_passwd (String rpasswd) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_retype_passwd_xpath"))).sendKeys(rpasswd);
		
	}
	
	public void select_dob_day (String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("register_dob_day_css"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	public void select_dob_month (String month) throws Exception
	{
		Select dob_month = new Select(driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("register_dob_month_css"))));
		dob_month.selectByVisibleText(month);
	}

	public void select_dob_year (String year) throws Exception
	{
		Select dob_year = new Select(driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("register_dob_year_css"))));
		dob_year.selectByVisibleText(year);
		
	}
		
				
	public void click_gender_male () throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_gender_male_xpath"))).click();
		
	}
	
	public void select_live_in (String live) throws Exception
	{
		Select live_in = new Select(driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_live_in_xpath"))));
		live_in.selectByVisibleText(live);
		
	}
	
	public void enter_recov_email (String recemail) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_recov_email_xpath"))).sendKeys(recemail);
		
	}
	
	public void enter_my_mobile (String mymobile) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_my_mobile_xpath"))).sendKeys(mymobile);
		
	}
	
	//public void enter_username(String string) {
		// TODO Auto-generated method stub
		
	}
	

