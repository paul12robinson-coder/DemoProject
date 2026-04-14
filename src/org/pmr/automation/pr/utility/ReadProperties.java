package org.pmr.automation.pr.utility;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadProperties 
{

	public static Object readconfigdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
		
	}
	
	public static Object readelementsdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/elements.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
		
	}
}
