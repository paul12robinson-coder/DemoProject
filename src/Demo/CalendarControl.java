package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CalendarControl
{
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void calendar_icon() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the chrome browser
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[aria-label='Dismiss sign-in info.']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Check-in date']")).click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[aria-label='We 1 April 2026']")).click();
		
		
		driver.findElement(By.cssSelector("[aria-label='Fr 3 April 2026']")).click();
		
		
	}
	
	@Test(enabled=true)
	public void calendar_text() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the chrome browser
		
		
		driver = new ChromeDriver();
		
		driver.get("https://practice-automation.com/calendars/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2020-03-04");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='4'][1]")).click();
		
	}
	
}
