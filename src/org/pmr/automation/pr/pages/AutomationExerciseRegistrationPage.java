package org.pmr.automation.pr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pmr.automation.pr.utility.ReadProperties;

public class AutomationExerciseRegistrationPage 
{

	WebDriver driver;
	
	public AutomationExerciseRegistrationPage(WebDriver driver) 
	{
		this.driver=driver;
				
	}
	
	public void click_signin_new_login () throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_new_login_css"))).click();
	}
	
	public void enter_signin_fullname (String signfull) throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_name_css"))).sendKeys(signfull);
		
	}
	
	public void enter_signin_email (String email) throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_email_css"))).sendKeys(email);
		
	}
	
	public void click_signin_bttn () throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_signup_bttn_css"))).click();
		
	}
	
	public void enter_signup_passwd (String spasswd) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("register_choose_passwd_xpath"))).sendKeys(spasswd);
		
	}
	
	public void select_dob_day (String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_dob_day_xpath"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	public void select_dob_month (String month) throws Exception
	{
		Select dob_month = new Select(driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_dob_month_xpath"))));
		dob_month.selectByVisibleText(month);
		
	}
	
	public void select_dob_year (String year) throws Exception
	{
		Select dob_year = new Select(driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_dob_year_xpath"))));
		dob_year.selectByVisibleText(year);
		
	}
	
	public void enter_signin_firstname (String firstname) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_fname_xpath"))).sendKeys(firstname);
		
	}
	
	public void enter_signin_lastname (String lastname) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_lname_xpath"))).sendKeys(lastname);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	
	public void enter_signin_address (String address) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_adresss_xpath"))).sendKeys(address);
		
	}
	
	public void enter_signin_country (String country) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_country_xpath"))).sendKeys(country);
		
	}
	
	public void enter_signin_state (String state) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_state_xpath"))).sendKeys(state);
		
	}
	
	public void enter_signin_city (String city) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_city_xpath"))).sendKeys(city);
		
	}
	
	public void enter_signin_zipcode (String zipcode) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_zipcode_xpath"))).sendKeys(zipcode);
		
	}
	
	public void enter_signin_mobileNum (String mobilenum) throws Exception
	{
		driver.findElement(By.xpath((String) ReadProperties.readelementsdata("signup_mobilenum_xpath"))).sendKeys(mobilenum);
		Thread.sleep(3000);
	}
	
	
	public void click_createacct_bttn () throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_createacct_css"))).click();
		
	}
	
	/*public void click_continue_bttn () throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("signup_continuebttn_css"))).click();
		
	}
	*/
}


	
	/*public void enter_password (String pass) throws Exception
	{
		driver.findElement(By.name((String) ReadProperties.readelementsdata("login_password_name"))).sendKeys(pass);
		
	}
	
	public void click_login_bttn () throws Exception
	{
		driver.findElement(By.cssSelector((String) ReadProperties.readelementsdata("login_loginbttn_css"))).click();
		
	}

	//public void enter_username(String string) {
		// TODO Auto-generated method stub
		
	}
	
*/
