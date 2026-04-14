package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class AutomationClass 
{
	
	WebDriver driver;
	//private EdgeDriver WebDriver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		//WebDriver driver = new EdgeDriver();  //launch the edge browser
		
		 
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
		driver.manage().window().maximize();
		
	}
	
	

	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	@Test
	public void validate_registration_functionality()
	{
		
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("Paul Robinson");
		driver.findElement(By.cssSelector("[id='login805d8e82']")).sendKeys("paul12robinson");
		driver.findElement(By.cssSelector("[placeholder='Enter password']")).sendKeys("pass123");
		((WebElement) driver.findElements(By.cssSelector("[placeholder='Retype password']"))).sendKeys("pass123");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}
	
	@Test
	public void validate_login_functionality()
	{
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("paul12robinson");
		
		driver.findElement(By.id("password")).sendKeys("password123");
		
		driver.findElement(By.className("signin-btn")).click();
		
		
	}
	
}
