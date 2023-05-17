package com.iEcho.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class OrgTeam extends Base{
	Action action = new Action();
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[1]/div/ul/a[2]")
	WebElement orgteam;
	
	@FindBy(xpath="//a[@data-autoid='view-more']")
	WebElement addnew;

	public OrgTeam() {
	PageFactory.initElements(driver, this);
	}
	
	public void clickorgteam() {
		action.click(driver, orgteam);
		action.click(driver, addnew);
	}


	
	}
