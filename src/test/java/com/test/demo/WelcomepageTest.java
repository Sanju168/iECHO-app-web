package com.test.demo;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.Welcomepage;


@Test
public class WelcomepageTest extends Base{
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		launchApp();
	}

	@Test
	public void WelcomepageTest() throws InterruptedException {
		
		Welcomepage wpa = new Welcomepage();
		wpa.clickOnContinue();
		Thread.sleep(2000);
		wpa.clickOnEmail();
		wpa.Enteremail(prop.getProperty("Email"), prop.getProperty("password"));
//		wpa.clickNext();
//		wpa.clickSubmit();
}
}

