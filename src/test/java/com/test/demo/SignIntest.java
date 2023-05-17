package com.test.demo;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.SignIn;
import com.iEcho.pages.Welcomepage;


public class SignIntest extends Base {
	Welcomepage welcomepage;
	SignIn signin;
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		launchApp();
	}
	@Test
	public void SigninTest() throws InterruptedException {
		
		welcomepage = new Welcomepage();
		welcomepage.clickOnContinue();
		signin = new SignIn();
		signin.clickOnEmail();
}
}
