package com.test.demo;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

@Test
public class combine extends Base{
	Action action = new Action();
	@FindBy(xpath = "//button[@id='language-selection-submit-btn']")
	WebElement languageSelection;
	
	public combine() {
		PageFactory.initElements(driver, this);

	}
	
	
	
	public void setup() throws MalformedURLException {
		
		launchApp();
	}
}
