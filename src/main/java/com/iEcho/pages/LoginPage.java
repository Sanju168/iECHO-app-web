package com.iEcho.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class LoginPage extends Base{
	Action action = new Action();

	@FindBy(name = "verifyEmail")
	WebElement LoginEmail;

	@FindBy(id = "submit")
	WebElement LoginSubmit;

	@FindBy(name = "password")
	WebElement EnterPassword;

	@FindBy(xpath = "//input[@type='email']")
	WebElement googleName;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/header[1]/div/div[2]/div[2]/span/i")
	WebElement dropdown;

	@FindBy(xpath="//*[@id=\"root\"]/div[2]/header[1]/div/div[2]/div[3]/ul[3]/li[2]/p")
	WebElement logout;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement Next;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	
	
	public void Enteremail(String Email, String password) {
		action.type(LoginEmail, Email);
	    action.click(driver, LoginSubmit);
	    action.type(EnterPassword, password);
	    action.click(driver, LoginSubmit);
		
	}
	public void logintest(String EmailQA, String password1) {
		
	    action.type(LoginEmail, EmailQA);
	    action.click(driver, LoginSubmit);
	    action.type(EnterPassword, password1);
	    action.click(driver, LoginSubmit);
	}
	
	public void enterEmail(String EmailQA) {
	    action.type(LoginEmail, EmailQA);
	}

	public void enterPassword(String password1) {
		action.type(EnterPassword, password1);
	}
	public void loginAR(String EmailAR, String password1) {
		
		action.type(LoginEmail, EmailAR);
		action.click(driver, LoginSubmit);
		action.type(EnterPassword, password1);
		action.click(driver, LoginSubmit);
		
	}

	public void enterEmailAR(String EmailAR) {
	    action.type(LoginEmail, EmailAR);
	}

	public void enterPassword1(String password1) {
		action.type(EnterPassword, password1);
	}
	
public void loginRA(String EmailRA, String password1) {
		
		action.type(LoginEmail, EmailRA);
		action.click(driver, LoginSubmit);
		action.type(EnterPassword, password1);
		action.click(driver, LoginSubmit);
		
	}

	public void enterEmailRA(String EmailRA) {
	    action.type(LoginEmail, EmailRA);
	}

	public void enterPassword2(String password1) {
		action.type(EnterPassword, password1);
	}
	public void dropdown() {
		action.click(driver, dropdown);
	}
	
	public void clicklogout() {
		action.click(driver, logout);
	}
	
	public void clickNext() {
		action.click(driver, Next);

	}
	public void clickSubmit() {
		action.click(driver, LoginSubmit);

	}


}

