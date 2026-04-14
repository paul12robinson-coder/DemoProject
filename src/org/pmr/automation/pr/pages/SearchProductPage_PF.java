package org.pmr.automation.pr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pmr.automation.pr.utility.ReadProperties;

public class SearchProductPage_PF 
{

	WebDriver driver;
	
	public SearchProductPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement product_link;
	
	@FindBy(xpath="//input[@id='search_product']")
	WebElement search_textbox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement search_button;
	
	public void click_product_menu_link () throws Exception
	{
		//WebElement username_textbox = driver.findElement(By.name((String) ReadProperties.readelementsdata("login.enter_username")));
		product_link.click();
	}
	
	public void enter_search_product (String product) throws Exception
	{
		search_textbox.sendKeys("Blue Top");
		
	}
	
	public void click_search_bttn () throws Exception
	{
		search_button.click();
	}

	
		
}
	

