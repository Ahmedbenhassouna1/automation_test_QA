package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ContactUsPage extends BasePage {

	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	public static WebElement btnContactUs;
	@FindBy(how = How.XPATH, using = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[2]")
	public static WebElement msgGetInTouch;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	public static WebElement name;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	public static WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	public static WebElement subject;
	@FindBy(how = How.XPATH, using = "//textarea[@id='message']")
	public static WebElement message;
	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	public static WebElement btnUploadFile;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	public static WebElement btnSubmit;
	//@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	//public static WebElement btnOk;
	@FindBy(how = How.XPATH, using = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[2]")
	public static WebElement msgSuccess;	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success']")
	public static WebElement btnHome;
	
	public ContactUsPage() {
		super (Setup.getDriver());
	}
	
	
	
	public static WebElement getBtnContactUs() {
		return btnContactUs;
	}
	public static WebElement getMsgGetInTouch() {
		return msgGetInTouch;
	}
	public static WebElement getName() {
		return name;
	}
	public static WebElement getEmail() {
		return email;
	}
	public static WebElement getSubject() {
		return subject;
	}
	public static WebElement getMessage() {
		return message;
	}
	public static WebElement getBtnSubmit() {
		return btnSubmit;
	}
	//public static WebElement getBtnOk() {
		//return btnOk;
	//}
	public static WebElement getMsgSuccess() {
		return msgSuccess;
	}
	public static WebElement getBtnHome() {
		return btnHome;
	}
	public static WebElement getBtnUploadFile() {
		return btnUploadFile;
	}
	
}
