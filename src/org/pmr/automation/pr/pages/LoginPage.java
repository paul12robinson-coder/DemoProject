package org.pmr.automation.pr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pmr.automation.pr.utility.ReadProperties;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
				
	}
	
	public void enter_username (String uname) throws Exception
	{
		driver.findElement(By.id((String) ReadProperties.readelementsdata("login_username_id"))).sendKeys(uname);
		
	}
	
	public void enter_password (String pass) throws Exception
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
	

