package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RegisterNewUserPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterNewUserStepDefinition  {
	
	public RegisterNewUserPage registerNewUserPage;
	public ConfigFileReader configFileReader;
	public SelectFromListUtils selectFromListUtils;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	
	public RegisterNewUserStepDefinition() {
		
		registerNewUserPage = new RegisterNewUserPage();
		configFileReader = new ConfigFileReader();
		selectFromListUtils = new SelectFromListUtils();
		seleniumUtils = new SeleniumUtils ();
		validations = new Validations();
	}
	
	@Given("I visit the platform automationexercise")
	public void i_visit_the_platform_automationexercise() {
	   Setup.getDriver().get(configFileReader.getProperties("home.url"));
		
	}

	@Then("Verify that home page is visible")
	public void verify_that_home_page_is_visible() {
	    validations.checkChangedURL(configFileReader.getProperties("home.url"));
		
	}

	@When("I click on the button Signup Login")
	public void i_click_on_the_button_signup_login() {
		
		seleniumUtils.click(RegisterNewUserPage.getBtnSinUpLogin());
		
	}

	@Then("Verify New User Signup is visible")
	public void verify_new_user_signup_is_visible() {
		validations.isElementDisplayed(RegisterNewUserPage.getnewUserSignup());
	   
	}

	@When("I enter name {string}")
	public void i_enter_name(String name) {
		seleniumUtils.writeText(RegisterNewUserPage.getName(), "Ahmed Ben Hassouna");
	}

	@When("I enter email  {string}")
	public void i_enter_email(String email) {
		seleniumUtils.writeText(RegisterNewUserPage.getEmail(), "ahmedbnh01@gmail.com");
	}

	@When("I click on Signup button")
	public void i_click_on_signup_button() {
		seleniumUtils.click(RegisterNewUserPage.getBtnLogIn());
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() {
	    validations.assertTrue(RegisterNewUserPage.getMsgEnterAccountInformation(), "Enter Account Information" );
	}
	@When("I fill in all the necessary information")
	public void i_fill_in_all_the_necessary_information(io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@When("I select checkbox Sign up for our newsletter")
	public void i_select_checkbox_sign_up_for_our_newsletter() {
		seleniumUtils.click(RegisterNewUserPage.getCheckBoxNewsletter());
		
	}

	@When("I select checkbox Receive special offers from our partners!")
	public void i_select_checkbox_receive_special_offers_from_our_partners(io.cucumber.datatable.DataTable dataTable) {
		seleniumUtils.click(RegisterNewUserPage.getCheckBoxOffer());
	}

	@When("I click on Create Account button")
	public void i_click_on_create_account_button() {
	   
	}

	@Then("Verify that ACCOUNT CREATED! is visible")
	public void verify_that_account_created_is_visible() {
	   
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
	   
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
	  
	}

	@When("I click Delete Account button")
	public void i_click_delete_account_button() {
	    
	}

	@Then("Verify that ACCOUNT DELETED! is visible")
	public void verify_that_account_deleted_is_visible() {
	   
	}

	@Then("I click Continue button")
	public void i_click_continue_button() {
	    
	}
	

}
