package com.test.demo;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.LoginPage;
import com.iEcho.pages.SignIn;

import com.iEcho.pages.Welcomepage;

public class LoginPageTest extends Base {
	Welcomepage welcomepage;
	SignIn signin;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		launchApp();
	}
	
	@Test
	public void verifySignIn() throws InterruptedException {
		welcomepage = new Welcomepage();
		signin = welcomepage.clickOnContinue();
		Thread.sleep(4000);
		
		loginpage =signin.clickOnEmail();
		loginpage.Enteremail(prop.getProperty("Email"), prop.getProperty("password"));
		loginpage.dropdown();
		loginpage.clicklogout();
		loginpage =signin.clickOnEmail();
		loginpage.logintest(prop.getProperty("EmailQA"), prop.getProperty("password1"));
		Thread.sleep(5000);
		loginpage.dropdown();
		loginpage.clicklogout();
		loginpage =signin.clickOnEmail();
		loginpage.loginAR(prop.getProperty("EmailRA"), prop.getProperty("password1"));
		Thread.sleep(6000);
		loginpage.dropdown();
		loginpage.clicklogout();
		loginpage =signin.clickOnEmail();
		loginpage.loginRA(prop.getProperty("EmailAR"), prop.getProperty("password1"));
		loginpage.dropdown();
		loginpage.clicklogout();
}
	
}
