package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LoginWithIncorrectIdPage extends BasePage {

	@FindBy(how = How.XPATH, using="//input[@data-qa='login-email']")
	public static WebElement email;

	@FindBy(how = How.XPATH, using="//input[@placeholder='Password']")
	public static WebElement password;

	@FindBy(how = How.XPATH, using="//h2[contains(text(),'Login to your account')]")
	public static WebElement msgLogin;

	@FindBy(how = How.XPATH, using="//button[normalize-space()='Login']")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using="//p[contains(text(),'Your email or password is incorrect!')]")
	public static WebElement msgVerification;

	public LoginWithIncorrectIdPage() {
		super(Setup.getDriver());
	}


	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getMsgLogin() {
		return msgLogin;
	}
	public static WebElement getBtnLogin() {
		return btnLogin;
	}	
	public static WebElement getMsgVerification() {
		return msgVerification;

	}

}
