package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementsDemo
{
	
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the chrome browser
		
		
		driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String exp_username_field = "Username";
		
		String act_username_field = driver.findElement(By.id("user-name")).getAttribute("placeholder");
		
		Assert.assertEquals(act_username_field, exp_username_field);
		
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Step 7: Click Login
        WebElement loginbttn = driver.findElement(By.id("login-button"));
        loginbttn.click();

        // Optional wait to see result
        Thread.sleep(3000);
        
       List<WebElement> productlist =  driver.findElements(By.cssSelector("[class='inventory_item_name_bkabvkbvvba ']"));
       
       System.out.println(productlist.size()); //6
       
       productlist.get(1).click();
		
		
	}
		
}
