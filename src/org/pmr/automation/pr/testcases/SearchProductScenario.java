package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.pages.LoginPage;
import org.pmr.automation.pr.pages.LoginPagePF;
import org.pmr.automation.pr.pages.SearchProductPage_PF;
import org.testng.annotations.Test;

public class SearchProductScenario extends InitiateBrowser

{
	@Test
	public void Test_Case9_Search_Product() throws Exception
	{
		SearchProductPage_PF searchprod = new SearchProductPage_PF(driver);
		
		searchprod.click_product_menu_link();
		searchprod.enter_search_product("Blue Top");
		searchprod.click_search_bttn();
		
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
