package org.pmr.automation.pr.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.pmr.automation.pr.utility.ReadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		if(ReadProperties.readconfigdata("BrowserName").equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadProperties.readconfigdata("BrowserName").equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadProperties.readconfigdata("BrowserName").equals("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else 
		{
			driver = new EdgeDriver();
		}
		
		driver.get((String) ReadProperties.readconfigdata("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	}
	
	@AfterMethod
	public void closebrowser()
	{
//		driver.quit();
	}
}
