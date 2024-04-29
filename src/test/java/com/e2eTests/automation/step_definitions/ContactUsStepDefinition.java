package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.ContactUsPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepDefinition {
	
	public ContactUsPage contactUsPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	
	public ContactUsStepDefinition() {
		
		contactUsPage = new ContactUsPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		
	}
	
	
	@When("I click on Contact Us button")
	public void i_click_on_contact_us_button() {
		seleniumUtils.click(ContactUsPage.getBtnContactUs());
		
	}

	@Then("Verify GET IN TOUCH is visible")
	public void verify_get_in_touch_is_visible() {
		//validations.assertEquals(ContactUsPage.getMsgGetInTouch(),"Get In Touch");
		validations.isElementDisplayed(ContactUsPage.getMsgGetInTouch());
	}

	@When("I enter the name {string}")
	public void i_enter_the_name(String name) {
		seleniumUtils.writeText(ContactUsPage.getName(), name);
	}

	@When("I enter the email {string}")
	public void i_enter_the_email(String email) {
		seleniumUtils.writeText(ContactUsPage.getEmail(), email);
	}

	@When("I enter the subject {string}")
	public void i_enter_the_subject(String subject) {
		seleniumUtils.writeText(ContactUsPage.getSubject(), subject);
	}

	@When("I enter the message {string}")
	public void i_enter_the_message(String message) {
		seleniumUtils.writeText(ContactUsPage.getMessage(), message);
	}

	
	@When("I upload a file {string}")
	public void i_upload_a_file(String path) {
		seleniumUtils.writeText(ContactUsPage.getBtnUploadFile(),path);
	}
	//@When("I upload a file")
	//public void i_upload_a_file() {
		//seleniumUtils.writeText(ContactUsPage.getBtnUploadFile(), "F:\\Auto avec Zied\\note.txt");
		//WebElement uploadFile();
				//seleniumUtils.click(ContactUsPage.());
		//uploadFile.sendKeys("F:\\Auto avec Zied\\note.txt");
			
		
	//}

	@When("I click on Submit button")
	public void i_click_on_submit_button() {
		seleniumUtils.click(ContactUsPage.getBtnSubmit());	
	}

	@When("I click on OK")
	public void i_click_on_ok() {
		seleniumUtils.acceptAlert();
	}

	@Then("Verify success message Success! Your details have been submitted successfully. is visible")
	public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
		validations.assertEquals(ContactUsPage.getMsgGetInTouch(),"Success! Your details have been submitted successfully.");  
	}

	@When("I click Home")
	public void i_click_home() {
		seleniumUtils.click(ContactUsPage.getBtnHome());
	}

	@Then("Verify that landed to home page successfully")
	public void verify_that_landed_to_home_page_successfully() {
		validations.checkChangedURL(configFileReader.getProperties("home.url"));
	}

}
