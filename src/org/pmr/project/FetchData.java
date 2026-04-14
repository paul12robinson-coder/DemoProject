package org.pmr.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchData 
{
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		WebDriver driver = new EdgeDriver();
		
		String expURL = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(expURL);
		driver.manage().window().maximize();
		
		Thread.sleep(3000); //pause 3sec
		 
		String actURL = driver.getCurrentUrl();  //Compare
		Assert.assertEquals(actURL, expURL);
		System.out.println(actURL);
		
		driver.close();
		//driver.quit();
	        
	     }
			
}
     
