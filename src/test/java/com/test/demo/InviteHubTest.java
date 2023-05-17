package com.test.demo;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.Invitehub;
import com.iEcho.pages.LoginPage;
import com.iEcho.pages.ManagehubPage;
import com.iEcho.pages.SignIn;
import com.iEcho.pages.Welcomepage;

public class InviteHubTest extends Base{
	Welcomepage welcomepage;
	SignIn signin;
	LoginPage loginpage;
	ManagehubPage managehub;
	Invitehub invitehub;
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		launchApp();
	}

	@Test
	public void managehubclick() throws InterruptedException {
		welcomepage = new Welcomepage();
		signin = welcomepage.clickOnContinue();
		
		Thread.sleep(4000);
		loginpage =signin.clickOnEmail();
		loginpage.Enteremail(prop.getProperty("Email"), prop.getProperty("password"));
		
		
		managehub=new ManagehubPage();
		Thread.sleep(4000);
		managehub.clickNext();
		
		invitehub = new Invitehub();
		invitehub.clickInviteHub();
		driver.findElement(By.id("SearchInputField")).sendKeys("c");
		List<WebElement> list = driver.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/ol[1]/li[1]"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			
			list.get(i).click();
//		    try {
//		        list.get(i).click();
//		    } catch (StaleElementReferenceException e) {
//		        list = driver.findElements(By.xpath("//div[@class='dropDownList dropDownList--open']//li"));
//		        if (list.size() > i) {
//		            list.get(i).click();
//		        } else {
//		            System.out.println("Exiting loop.");
//		            break;
//		        }
//		    }
		}

		invitehub.form();

		driver.findElement(By.xpath("(//input[@id='SearchInputField'])[2]")).sendKeys("Gover");

		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='dropDownList dropDownList--open']//li[2]"));
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
		    try {
		        list1.get(i).click();
		    } catch (StaleElementReferenceException e) {
		        list1 = driver.findElements(By.xpath("//div[@class='dropDownList dropDownList--open']//li[2]"));
		        if (list1.size() > i) {
		            list1.get(i).click();
		        } else {
		            System.out.println("Exiting loop.");
		            break;
		        }
		    }
		}

		}
		
		//invitehub.hubformsubmit();
}
