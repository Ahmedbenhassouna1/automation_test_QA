package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RegisterUserWithExistingEmailPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserWithExistingEmailStepDefinition {
	
	public RegisterUserWithExistingEmailPage registerUserWithExistingEmailpage;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public ConfigFileReader configFileReader;
	
	public RegisterUserWithExistingEmailStepDefinition() {
		
		registerUserWithExistingEmailpage = new RegisterUserWithExistingEmailPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
	}
	
	
	
	
	@When("I type a name {string}")
	public void i_type_a_name(String name) {
		seleniumUtils.writeText(RegisterUserWithExistingEmailPage.getName(), name);
	}

	@When("I type an existing email {string}")
	public void i_type_an_existing_email(String email) {
		seleniumUtils.writeText(RegisterUserWithExistingEmailPage.getEmail(), email);
	}

	@When("I click on button signup")
	public void i_click_on_button_signup() {
		seleniumUtils.click(RegisterUserWithExistingEmailPage.getBtnSignup());
	}

	@Then("Verify error Email Address already exist! is visible")
	public void verify_error_email_address_already_exist_is_visible() {
		validations.isElementDisplayed(RegisterUserWithExistingEmailPage.getMsgError());
	}


}
