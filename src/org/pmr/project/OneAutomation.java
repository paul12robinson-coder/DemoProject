package org.pmr.project;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OneAutomation 
{
	
	@Test
	public void validate_registration_functionality() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("Paul Robinson");
		
		driver.findElement(By.cssSelector("[placeholder='Enter Rediffmail ID']")).sendKeys("paul12robinson");
		 
		driver.findElement(By.cssSelector("[placeholder='Enter password']")).sendKeys("passwd123");
		driver.findElement(By.cssSelector("[id='newpasswd1']")).sendKeys("passwd123");
		
		Select dob_day = new Select(driver.findElement(By.cssSelector("[class='day']")));
		//dob_day.selectByIndex(4);  //4
		//dob_day.selectByValue("04");
		dob_day.selectByVisibleText("04");
		//dob_day.selectByContainsVisibleText("04");
		
		Select dob_month = new Select(driver.findElement(By.cssSelector("[class='middle month']")));
		dob_month.selectByVisibleText("MAY");
		//dob_month.selectByVisibleText("JUNE");
		//dob_month.deselectByVisibleText("MAY");
		//dob_month.deselectAll();
		
		
		Select dob_year = new Select (driver.findElement(By.cssSelector("[class='year']")));
		dob_year.selectByVisibleText("2010");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Actions act = new Actions (driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//select[contains(@name,'city')]")),"Salem"));
		
		//Explicit Wait
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[value='Create my account']"))));
		driver.findElement(By.cssSelector("[value='Create my account']")).click();
		
		Thread.sleep(2000);
		
		Select live_country = new Select (driver.findElement(By.cssSelector("select#country")));
		live_country.selectByVisibleText("United States");
		
		driver.findElement(By.cssSelector("input[placeholder='Enter recovery email']")).sendKeys("paul12rob@gmail.com");
		
		driver.findElement(By.cssSelector("input#mobno")).sendKeys("7031234567");
		Thread.sleep(2000);
		
		CaptureScreenshot.testresults(driver, "validate_registration_functionality");
		//driver.close();
		
	}
	
	
	@Test(enabled=true)
	public void validate_login_functionality() throws Exception
	{
		WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("paul12robinson");
		Thread.sleep(2000);
		
		username.clear();
		username.sendKeys("paul25robinson");
		
		
		driver.findElement(By.name("passwd")).sendKeys("pass123");
		driver.findElement (By.className("signin-btn")).click(); 
		
		CaptureScreenshot.testresults(driver, "validate_login_functionality");
	}
	
}
