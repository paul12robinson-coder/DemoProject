package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.pages.LoginPage;
import org.pmr.automation.pr.pages.LoginPagePF;
import org.pmr.automation.pr.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegisterScenario extends InitiateBrowser

{
	@Test
	public void tc02_validate_register_functionality_valid_credentail() throws Exception
	{
		RegistrationPage reg = new RegistrationPage(driver);
		reg.click_register_newId();
		reg.enter_fullname("Doo Nice");
		reg.enter_email("paul112rob");
		reg.enter_choose_passwd("password12");
		reg.enter_retype_passwd("password12");
		reg.select_dob_day("12");
		reg.select_dob_month("AUG");
		reg.select_dob_year("1990");
		reg.click_gender_male();
		reg.select_live_in("United States");
		reg.enter_recov_email("dnice@gmail.com");
		reg.enter_my_mobile("5855465191");
		
				
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
