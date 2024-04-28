package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginWithCorrectIDPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithCorrectIDStepDefinition {

	public LoginWithCorrectIDPage loginWithCorrectIDPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;

	public LoginWithCorrectIDStepDefinition() {

		loginWithCorrectIDPage = new LoginWithCorrectIDPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils ();
		validations = new Validations();
	}

	@When("I type a valid email {string}")
	public void i_type_a_valid_email(String email) {
		seleniumUtils.writeText(LoginWithCorrectIDPage.getEmail(), email);

	}

	@When("I type a valid password {string}")
	public void i_type_a_valid_password(String password) {
		seleniumUtils.writeText(LoginWithCorrectIDPage.getPassword(), password);
	}

	@When("I click on button login")
	public void i_click_on_button_login() {
		seleniumUtils.click(LoginWithCorrectIDPage.getBtnLogin());

	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {

		validations.assertEquals(LoginWithCorrectIDPage.getUsername(), "Ahmed Ben hassouna");
	}


}
