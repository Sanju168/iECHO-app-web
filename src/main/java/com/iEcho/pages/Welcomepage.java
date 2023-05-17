package com.iEcho.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iEcho.action.Action;
import com.iEcho.base.Base;
import com.iEcho.pages.SignIn;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Welcomepage extends Base{
	Action act = new Action();

	@FindBy(xpath = "//button[@id='language-selection-submit-btn']")
	WebElement selectlanguage;
	
	@FindBy (xpath="//span[contains(text(),'Continue with Email')]")
	WebElement Email;

	@FindBy(name = "verifyEmail")
	WebElement LoginEmail;

	@FindBy(id = "submit")
	WebElement LoginSubmit;

	@FindBy(name = "password")
	WebElement EnterPassword;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement Next;
	
	public Welcomepage() {
		PageFactory.initElements(driver, this);

	}
 
		public SignIn clickOnContinue() {
			act.click(driver, selectlanguage);
			return new SignIn();
			
		}
		
		public SignIn clickOnEmail() {
			act.click(driver, Email);
			return new SignIn();
			
		}
		
		
		
		public void Enteremail(String Email, String password) {
			act.type(LoginEmail, Email);
		    act.click(driver, LoginSubmit);
		    act.type(EnterPassword, password);
		    act.click(driver, LoginSubmit);
			
		}
		
		public void clickNext() {
			act.click(driver, Next);

		}
		public void clickSubmit() {
			act.click(driver, LoginSubmit);

		}
		
	}

