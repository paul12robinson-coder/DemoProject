package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.pages.LoginPage;
import org.pmr.automation.pr.pages.LoginPagePF;
import org.testng.annotations.Test;

public class LoginScenario extends InitiateBrowser

{
	@Test
	public void tc01_validate_login_functionality_valid_credentail() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_login_bttn();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
