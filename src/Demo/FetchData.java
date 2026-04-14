package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchData
{
	
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the chrome browser
		
		
		driver = new EdgeDriver();
		
		String expURL = "https://mail.rediff.com/cgi-bin/login.cgi/";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertEquals(actURL, expURL);
		
		driver.manage().window().maximize();
		
		String exp_LoginPageTitle = "Rediffmail - Free Email for Login with Secure Access";
		
		String act_LoginPageTitle = driver.getTitle();
		System.out.println(act_LoginPageTitle);
		
		Assert.assertEquals(act_LoginPageTitle, exp_LoginPageTitle);
		
		String exp_rediffmail_id_text = "Rediffmail ID :";
		String act_rediffmail_id_text = driver.findElement(By.xpath("//label[text()='Rediffmail ID :']")).getText();
		
		Assert.assertEquals(act_rediffmail_id_text, exp_rediffmail_id_text);
		
		System.out.println(driver.findElement(By.id("remember")).isSelected());  //checkbox  true
		
		driver.findElement(By.id("remember")).click();  //uncheckbox
		
		System.out.println(driver.findElement(By.id("remember")).isSelected());  //checkbox false
		
		Assert.assertEquals(driver.findElement(By.name("proceed")).getText(), "Log In");
		
		System.out.println(driver.findElement(By.name("proceed")).getLocation());
		
		System.out.println(driver.findElement(By.name("proceed")).isEnabled());  //login button is enabled
		
		System.out.println(driver.findElement(By.name("proceed")).isDisplayed());  //login button is displayed
		
		
		
		
		
		
		//System.out.println(driver.getPageSource());
		
	}
		
}
