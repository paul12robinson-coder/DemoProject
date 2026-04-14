package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserControl
{
	
	WebDriver driver;
	
	@Test
	public void launchbrowser() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the chrome browser
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
				
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(5000);
				
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		Thread.sleep(5000);
		
		//driver.close();  //close only one window
		driver.quit();  //close all windows
		
	}
	
}
