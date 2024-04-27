package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class RegisterNewUserPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement name;

	@FindBy(how = How.XPATH, using ="//input[@data-qa='signup-email']" )
	private static WebElement email; 

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement btnSinUpLogin;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newUserSignup;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	private static WebElement btnLogIn;

	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	private static WebElement title;

	//@FindBy(how = How.XPATH, using = "//input[@id='name'")
	//private static WebElement nameId;                          

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//select[@id='days']")
	private static WebElement day;

	@FindBy(how = How.XPATH, using = "//select[@id='months']")
	private static WebElement month;

	@FindBy(how = How.XPATH, using = "//select[@id='years']")
	private static WebElement year;

	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']")
	private static WebElement checkBoxNewsletter;

	@FindBy(how = How.XPATH, using = "//input[@id='optin']")
	private static WebElement checkBoxOffer;

	@FindBy(how = How.XPATH, using = "//input[@id='first_name']")
	private static WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@id='last_name']")
	private static WebElement lastName;

	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	private static WebElement company;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	private static WebElement address;

	@FindBy(how = How.XPATH, using = "//input[@id='address2']")
	private static WebElement address2;

	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	private static WebElement dropBoxCountry;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	private static WebElement state;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	private static WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='zipcode']")
	private static WebElement zipCode;

	@FindBy(how = How.XPATH, using = "//input[@id='mobile_number']")
	private static WebElement mobileNumber;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	private static WebElement btnCreateAccount;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Created!']")
	private static WebElement msgAccountCreated;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnContinue;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Ahmed Ben hassouna']")
	private static WebElement nameLoged;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
	private static WebElement btnDeleteAccount;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Deleted!']")
	private static WebElement msgDeleteAccount;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnContinueDelete;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	private static WebElement msgEnterAccountInformation;
	
	public RegisterNewUserPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getnewUserSignup() {
		return newUserSignup;	
	}
	public static WebElement getEmail() {
		return email;	
	}
	public static WebElement getName() {
		return name;
	}

	public static WebElement getBtnSinUpLogin() {
		return btnSinUpLogin;
	}
	
	public static WebElement getBtnLogIn() {
		return btnLogIn;
	}
	
	public static WebElement getMsgEnterAccountInformation() {
		return msgEnterAccountInformation;
	}
	
	public static WebElement getTitle() {
		return title;
	}
	
	public static WebElement getPassword() {
		return password;
	}
	
	
	public static WebElement getDay() {
		return day;
	}
	
	public static WebElement getMonth() {
		return month;
	}
	
	public static WebElement getYear() {
		return year;
	}
	
	public static WebElement getCheckBoxNewsletter() {
		return checkBoxNewsletter;
	}
	
	public static WebElement getCheckBoxOffer() {
		return checkBoxOffer;
	}
	
	public static WebElement getFirstName() {
		return firstName;
	}
	
	public static WebElement getLastName() {
		return lastName;
	}
	
	public static WebElement getCompany() {
		return company;
	}
	
	public static WebElement getAddress() {
		return address;
	}
	
	public static WebElement getAddress2() {
		return address2;
	}
	
	public static WebElement getDropBoxCountry() {
		return dropBoxCountry;
	}
	
	public static WebElement getState() {
		return state;
	}
	
	public static WebElement getCity() {
		return city;
	}
	
	public static WebElement getZipCode() {
		return zipCode;
	}
	
	public static WebElement getMobileNumber() {
		return mobileNumber;
	}
	
	public static WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}
	
	public static WebElement getMsgAccountCreated() {
		return msgAccountCreated;
	}
	
	public static WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public static WebElement getNameLoged() {
		return nameLoged;
	}
	
	public static WebElement getBtnDeleteAccount() {
		return btnDeleteAccount;
	}
	
	public static WebElement getMsgDeleteAccount() {
		return msgDeleteAccount;
	}
	
	public static WebElement getBtnContinueDelete() {
		return btnContinueDelete;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


