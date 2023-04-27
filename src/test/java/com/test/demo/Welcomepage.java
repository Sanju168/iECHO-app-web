package com.test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


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
