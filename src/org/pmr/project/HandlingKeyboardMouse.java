package org.pmr.project;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingKeyboardMouse 
{
	WebDriver driver;
	
	@Test
	public void handlemouse() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions (driver);
		act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform(); //right-click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//act.dragAndDrop(null, null).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		System.out.println(windowsid);
		
		Iterator<String> iter = windowsid.iterator();
		String win1 = iter.next();
		String win2 = iter.next();
	}
	
	@Test(enabled=false)
	public void loginpage() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		WebDriver driver = new EdgeDriver();
		
		String expURL = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(expURL);
		driver.manage().window().maximize();
		
		Thread.sleep(3000); //pause 3sec
		
		Actions act = new Actions(driver);
		act.sendKeys("paul12robinson").perform();
		Thread.sleep(3000);
		//act.sendKeys(Keys.TAB).perform();  //special keys
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform(); //keyboard 
		//act.sendKeys("pass123").perform();
		
		
		//act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000); //pause 3sec
		 
		//String actURL = driver.getCurrentUrl();  //Compare
		//Assert.assertEquals(actURL, expURL);
		//System.out.println(actURL);
		
		//driver.close();
		//driver.quit();
	        
	     }
			
}
     
