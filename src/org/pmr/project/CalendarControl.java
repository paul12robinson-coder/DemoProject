package org.pmr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CalendarControl 
{
	
	@Test
	public void launchbrowser() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		//driver.get("https://www.google.com");
		
		Thread.sleep(3000); //pause 3sec
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //load a webpage and wait for full page to load
		driver.manage().window().maximize();
		
		//driver.navigate().back();   //navigate between pages
		//Thread.sleep(3000);
		
		//driver.navigate().forward();
		//Thread.sleep(3000);
		
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("Paul Robinson");
		
		// Click on country code dropdown to open it
        WebElement countryCodeDropdown = driver.findElement(By.className("countryCodeText"));
        countryCodeDropdown.click();
        
        Object wait;
		// Wait for dropdown to appear and select a country (e.g., India +91)
        //WebElement countryList = ((Object)wait).wait(ExpectedConditions.visibilityOfElementLocated(By.id("country_id"))
        //);
        Actions act = new Actions (driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
        
        // Select India (+91) from the list
        WebElement indiaOption = driver.findElement(
            By.xpath("//li[contains(text(), 'India (+91)')]")
        );
        indiaOption.click();
        Thread.sleep(3000);
        
        // Enter mobile number
        WebElement mobileInput = driver.findElement(By.id("mobno"));
        mobileInput.clear();
        mobileInput.sendKeys("9876543210");
        Thread.sleep(3000);
        
		//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.close();
		//driver.quit();
	}
	
}