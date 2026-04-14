package org.pmr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	@Test
	public void launchbrowser() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000); //pause 3sec
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //load a webpage and wait for full page to load
		driver.manage().window().maximize();
		
		driver.navigate().back();   //navigate between pages
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.close();
		//driver.quit();
	}
	
}