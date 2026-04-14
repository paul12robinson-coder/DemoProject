package org.pmr.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebElementsDemo 
{
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		//WebDriver driver = new ChromeDriver();  //launch the Chrome browser
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000); //pause 3sec
		 WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");

	        // Locate Password field and enter value
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");

	        // Click Login button
	        WebElement loginBtn = driver.findElement(By.id("login-button"));
	        loginBtn.click();

	        // Optional: wait for few seconds
	        Thread.sleep(3000);
	        
	       
	        List<WebElement> productlist = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
	        System.out.println(productlist.size());   //6
	        productlist.get(1).click();
	        Thread.sleep(3000);
		
		driver.close();
		//driver.quit();
	        
	     }
			
}
     
