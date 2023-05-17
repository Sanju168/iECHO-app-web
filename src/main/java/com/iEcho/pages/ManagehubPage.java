package com.iEcho.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class ManagehubPage extends Base{
	Action action = new Action();
	
	@FindBy(xpath = "//span[contains(text(),'Manage Hub')]")
	WebElement Managehub;
	
//	@FindBy(xpath = "//a[@data-autoid='view-more']")
//	WebElement InviteHub;

public ManagehubPage() {
	PageFactory.initElements(driver, this);	
}


//public void InviteHub() {
//	PageFactory.initElements(driver, InviteHub);
//	
//}


	public void clickNext() {
		action.click(driver, Managehub);
		//action.click(driver, InviteHub);

	}
}