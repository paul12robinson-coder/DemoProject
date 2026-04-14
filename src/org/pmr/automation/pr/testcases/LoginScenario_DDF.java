package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.data.DataClass;
import org.pmr.automation.pr.pages.LoginPage;
import org.pmr.automation.pr.pages.LoginPagePF;
import org.testng.annotations.Test;

public class LoginScenario_DDF extends InitiateBrowser
{
	@Test(dataProvider="login", dataProviderClass=DataClass.class)
	public void tc01_validate_login_functionality_valid_credentail(String username, String password) throws Exception
	{
		LoginPagePF login = new LoginPagePF(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_login_bttn();
		
		
	}
	
	
	
}
