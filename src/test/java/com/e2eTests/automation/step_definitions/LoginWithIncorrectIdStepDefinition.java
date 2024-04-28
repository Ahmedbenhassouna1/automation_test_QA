package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginWithIncorrectIdPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithIncorrectIdStepDefinition {

	public LoginWithIncorrectIdPage loginWithIncorrectIdPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public LoginWithIncorrectIdStepDefinition() {

		loginWithIncorrectIdPage = new LoginWithIncorrectIdPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	}

	@Then("Verify Login to your account visible")
	public void verify_login_to_your_account_visible() {
		validations.assertEquals(LoginWithIncorrectIdPage.getMsgLogin(), "Login to your account");
	}

	@When("I type an ivalid email {string}")
	public void i_type_an_ivalid_email(String email) {
		seleniumUtils.writeText(LoginWithIncorrectIdPage.getEmail(), email);
	}

	@When("I type an ivalid password {string}")
	public void i_type_an_ivalid_password(String password) {
		seleniumUtils.writeText(LoginWithIncorrectIdPage.getPassword(), password);
	}

	@When("I click on button login signup")
	public void i_click_on_button_login_signup() {
		seleniumUtils.click(LoginWithIncorrectIdPage.getBtnLogin());
	}

	@Then("Verify error Your email or password is incorrect! is visible")
	public void verify_error_your_email_or_password_is_incorrect_is_visible() {
		validations.assertEquals(LoginWithIncorrectIdPage.getMsgVerification(), "Your email or password is incorrect!");
	}


}
