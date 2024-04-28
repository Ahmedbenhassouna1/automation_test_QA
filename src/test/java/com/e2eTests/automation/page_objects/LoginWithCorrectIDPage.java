package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LoginWithCorrectIDPage extends BasePage {

	@FindBy(how = How.XPATH, using="//input[@data-qa='login-email']")
	public static WebElement email;

	@FindBy(how = How.XPATH, using="//input[@placeholder='Password']")
	public static WebElement password;

	@FindBy(how = How.XPATH, using="//button[normalize-space()='Login']")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using="//b[contains(text(),'Ahmed Ben hassouna')]")
	public static WebElement username;


	public LoginWithCorrectIDPage() {
		super(Setup.getDriver());	
	}


	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	public static WebElement getUsername() {
		return username;
	}

}
