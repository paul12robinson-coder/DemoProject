package org.pmr.automation.pr.testcases;

import org.pmr.automation.pr.base.InitiateBrowser;
import org.pmr.automation.pr.data.DataClass;
import org.pmr.automation.pr.pages.LoginPage;
import org.pmr.automation.pr.pages.LoginPagePF;
import org.pmr.automation.pr.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegisterScenario_DDF extends InitiateBrowser

{
	@Test(dataProvider="register", dataProviderClass=DataClass.class)
	public void tc02_validate_register_functionality_valid_credentail(String fullname, String email, String choose_passwd, String retype_passwd, String dob_day, String dob_month, String dob_year, String live_in, String recov_email, String my_mobile) throws Exception
	{
		RegistrationPage reg = new RegistrationPage(driver);
		reg.click_register_newId();
		reg.enter_fullname(fullname);
		reg.enter_email(email);
		reg.enter_choose_passwd(choose_passwd);
		reg.enter_retype_passwd(retype_passwd);
		reg.select_dob_day(dob_day);
		reg.select_dob_month(dob_month);
		reg.select_dob_year(dob_year);
		reg.click_gender_male();
		reg.select_live_in(live_in);
		reg.enter_recov_email(recov_email);
		reg.enter_my_mobile(my_mobile);
		
				
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
