package org.pmr.automation.pr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pmr.automation.pr.utility.ReadProperties;

public class LoginPagePF 
{

	WebDriver driver;
	
	public LoginPagePF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(id="user-name")
	WebElement username_textbox;
	
	@FindBy(name="password")
	WebElement password_textbox;
	
	@FindBy(css="[type='submit']")
	WebElement loginbttn;
	
	public void enter_username (String pass) throws Exception
	{
		//WebElement username_textbox = driver.findElement(By.name((String) ReadProperties.readelementsdata("login.enter_username")));
		username_textbox.sendKeys("standard_user");
	}
	
	public void enter_password (String pass) throws Exception
	{
		password_textbox.sendKeys("secret_sauce");
		
	}
	
	public void click_login_bttn () throws Exception
	{
		loginbttn.click();
	}

	
		
}
	

