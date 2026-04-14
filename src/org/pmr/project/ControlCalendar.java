package org.pmr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ControlCalendar 
{
	
	@Test
	public void calendar_icon() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://practice-automation.com/calendars/");
		
		Thread.sleep(3000); //pause 3sec
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //load a webpage and wait for full page to load
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'g1065-1-selectorenteradate')]")).sendKeys("1971-08-17");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='17'][1]")).click();
		//driver.close();
		//driver.quit();
	}
	
	
	@Test(enabled=false)
	public void calendar_text() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://practice-automation.com/calendars/");
		
		Thread.sleep(3000); //pause 3sec
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //load a webpage and wait for full page to load
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'g1065-1-selectorenteradate')]")).sendKeys("1971-08-17");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='17'][1]")).click();
		//driver.close();
		//driver.quit();
	}
	
}