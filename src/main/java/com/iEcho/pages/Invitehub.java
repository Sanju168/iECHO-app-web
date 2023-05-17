package com.iEcho.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.iEcho.action.Action;
import com.iEcho.base.Base;

public class Invitehub extends Base {

	Action action = new Action();
	//WebDriver driver = new ChromeDriver();
	
	@FindBy(xpath = "//a[@data-autoid='view-more']")
	WebElement InviteHub;
	
	@FindBy (xpath="//input[@id='name']")
	WebElement hubName;
	
	@FindBy (xpath="//input[@id='SearchInputField']")
	WebElement Orgcategory;
	
//	@FindBy(xpath="//div[@class='dropDownList dropDownList--open']//li")
//	List<WebElement> list;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement emailadd;
	
	@FindBy (xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy (xpath="//input[@id='streetAddress']")
	WebElement address;
	
	@FindBy (xpath="//input[@id='SearchInputField'][2]")
	WebElement regtype;
	
	@FindBy (id="description")
	WebElement description;
	
	@FindBy (id="salesforceID")
	WebElement salesforceID;
	
    @FindBy(xpath="//*[@id=\"hubform_submit\"]")
    WebElement submit;

	public Invitehub() {
	PageFactory.initElements(driver, this);
	}
	
	public void clickInviteHub() {
	action.click(driver, InviteHub);

		
	}
	
	public void form() {
		hubName.sendKeys("AIIMS HISAR");
		address.sendKeys("Hisar, Haryana, India");
		description.sendKeys("ECHO INDIA description");
		salesforceID.sendKeys("0014P000034pKeD");
		emailadd.sendKeys("sanjeeva.bakshi+p9@echoindia.in");
		firstname.sendKeys("RANJAN");


			
	}
//	public void hubformsubmit() {
//		action.click(driver, submit);
//	}

}
	
	
	