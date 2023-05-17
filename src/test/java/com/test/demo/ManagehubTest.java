package com.test.demo;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.LoginPage;
import com.iEcho.pages.ManagehubPage;
import com.iEcho.pages.SignIn;
import com.iEcho.pages.Welcomepage;

public class ManagehubTest extends Base{
	Welcomepage welcomepage;
	SignIn signin;
	LoginPage loginpage;
	ManagehubPage managehub;
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		launchApp();
	}
	@Test
	public void managehubclick() throws InterruptedException {
		welcomepage = new Welcomepage();
		signin = welcomepage.clickOnContinue();
		
		Thread.sleep(8000);
		loginpage =signin.clickOnEmail();
		loginpage.Enteremail(prop.getProperty("EmailQA"), prop.getProperty("password1"));
		
		
		managehub=new ManagehubPage();
		Thread.sleep(10000);
		managehub.clickNext();
		
}
}
