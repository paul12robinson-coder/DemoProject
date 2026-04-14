package org.pmr.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	
	
	public static void testresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;  //takes screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		File fd = new File("./screenshot/sprint1/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
		//String car = "BMW";
		//System.out.println("I love my " + car + " Its da bomb");
	}
	
}
