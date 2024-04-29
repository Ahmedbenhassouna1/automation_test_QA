package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class RegisterUserWithExistingEmailPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	public static WebElement name;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	public static WebElement email;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	public static WebElement btnSignup;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Email Address already exist!')]")
	public static WebElement msgError;

	public RegisterUserWithExistingEmailPage() {
		super (Setup.getDriver());
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getBtnSignup() {
		return btnSignup;
	}
	
	public static WebElement getMsgError() {
		return msgError;
	}

}
