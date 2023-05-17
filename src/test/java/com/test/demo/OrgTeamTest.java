package com.test.demo;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iEcho.base.Base;
import com.iEcho.pages.Invitehub;
import com.iEcho.pages.LoginPage;
import com.iEcho.pages.ManagehubPage;
import com.iEcho.pages.OrgTeam;
import com.iEcho.pages.SignIn;
import com.iEcho.pages.Welcomepage;

public class OrgTeamTest extends Base{
	Welcomepage welcomepage;
	SignIn signin;
	LoginPage loginpage;
	ManagehubPage managehub;
	Invitehub invitehub;
	OrgTeam orgteampage;
	
	
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
	
	orgteampage = new OrgTeam();
	orgteampage.clickorgteam();
	
	
}
}
