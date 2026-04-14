package org.pmr.automation.pr.data;

import org.testng.annotations.DataProvider;

public class DataClass 
{

	@DataProvider(name="login")
	public Object[][] logindata()
	{
		//String data1 = "user1";
		Object[][] data2 = {{"user1","pass1"}};
		//Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		return data2;
	}
	
	@DataProvider(name="register")
	public Object[][] registerdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};
		//Object[][] data3 = {{"David Seo","it_david","09"},{"John Leo","it_john","10"},{"Neena Alex","it_neena","11"}};  //2-D array
		  Object[][] data4 = {{"David Seo",
		            "it_david",
		            "password123",
		            "password123",
		            "12",
		            "AUG",
		            "1990",
		            "United States",
		            "recovery@email.com",
		            "5850009999"
		  }
		  
		  };
		  
		return data4;
	}
	
}
