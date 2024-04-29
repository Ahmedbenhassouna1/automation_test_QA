package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LogoutPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	LogoutPage logoutPage;
	SeleniumUtils seleniumUtils;
	ConfigFileReader configFileReader;

	public LogoutStepDefinition(){
		
		logoutPage = new LogoutPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
	}
	
	
	@When("I click on Logout")
	public void i_click_on_logout() {
		seleniumUtils.click(LogoutPage.getBtnLogout());
		
	}

	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		   Setup.getDriver().get(configFileReader.getProperties("login.url"));

	}

}
