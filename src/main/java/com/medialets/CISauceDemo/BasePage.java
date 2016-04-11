package com.medialets.CISauceDemo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage
{
	
	public static final String USERNAME = "MahdiShahadat";
	public static final String ACCESS_KEY = "0e7d12f7-1389-4cb3-8435-8d09ca42d093";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String url) throws Exception
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "49.0");

			driver = new RemoteWebDriver(new URL(URL), caps);
		}
//		else if(browserName.equalsIgnoreCase("firefox"))
//		{
//			DesiredCapabilities caps = DesiredCapabilities.firefox();
//			caps.setCapability("platform", "Windows 10");
//			caps.setCapability("version", "45.0");
//
//			driver = new RemoteWebDriver(new URL(URL), caps);
//		}
//		if(browserName.equalsIgnoreCase("IE"))
//		{
//			driver = new InternetExplorerDriver();
//		}

		driver.manage().window().maximize();
		driver.get(url);

		return driver;
	}

}
