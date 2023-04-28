package com.test.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Welcomepage {

	public void testApp() throws MalformedURLException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, DesiredCapabilities.chrome());
		
		WebDriver driver = new RemoteWebDriver(new URL("https://qaelb.test.metaecho.com/wd/hub"), cap);
		
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setBrowserName(BrowserType.CHROME);
//		driver = new RemoteWebDriver(new URL("https://qaelb.test.metaecho.com/wd/hub"), cap);
//		
		driver.get("https://demo.iecho.org/welcome");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

	
}
