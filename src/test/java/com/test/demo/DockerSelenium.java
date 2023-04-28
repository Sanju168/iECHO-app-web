package com.test.demo;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.iEcho.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class DockerSelenium extends Base{
	
public void setup() throws MalformedURLException {
	launchApp();
}
       
    
}


