package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.pages.AutomationExerciseRegistrationPage;
import org.testng.annotations.Test;


public class AutomationRegistrationScenario extends InitiateBrowser

{
	@Test
	public void tc01_validate_Signup_login_credentail() throws Exception
	{
		AutomationExerciseRegistrationPage reg = new AutomationExerciseRegistrationPage(driver);
		reg.click_signin_new_login();
		reg.enter_signin_fullname("Jay Jayson");
		reg.enter_signin_email("pmr_test02@gmail.gov");
		reg.click_signin_bttn();
		reg.enter_signup_passwd("jackpasswd");
		reg.select_dob_day("17");
		reg.select_dob_month("August");
		reg.select_dob_year("1981");
		reg.enter_signin_firstname("JayJay");
		reg.enter_signin_lastname("Jones Sr");
		reg.enter_signin_address("10102 Main St");
		reg.enter_signin_country("United States");
		reg.enter_signin_state("Arizona");
		reg.enter_signin_city("Phenix");
		reg.enter_signin_zipcode("30298");
		reg.enter_signin_mobileNum("5857650923");
		reg.click_createacct_bttn();
//		reg.click_continue_bttn();
				
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
