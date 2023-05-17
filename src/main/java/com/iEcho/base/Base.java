package com.iEcho.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

//import com.iEcho.action.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author SANJEEVA-ECHO
 *
 */


public class Base {

	public static Properties prop;

	public static WebDriver driver;

	/* Load the configuration */
	@BeforeSuite(groups = {"Smoke","Sanity"})
	public void loadConfig() throws IOException {
		//ExtentManager.setExtent();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "//Configuration//config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void launchApp() throws MalformedURLException {
		
	
		String browserName = prop.getProperty("browser");

		String dockerName = prop.getProperty("docker");
		
		if (dockerName.equals("no"))
		{			
 		if (browserName.equalsIgnoreCase("Chrome")) {
			
 			WebDriverManager.chromedriver().setup();
	
			driver = new ChromeDriver();
			
			
 		} else if (browserName.equalsIgnoreCase("FireFox")) {
 			WebDriverManager.edgedriver().setup();
 			driver = new EdgeDriver();
 		}}
 		else {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		driver = new RemoteWebDriver(new URL("https://qaelb.test.metaecho.com/wd/hub"), cap);
 		}

	//	Action ac = new Action();
//		ac.pageLoadTimeOut(driver, 30);

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));

	}
	}


