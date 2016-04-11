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
			String[] platforms = new String[2];
			platforms[0] = "OS X 10.11";
			platforms[1] = "OS X 10.10";
			String[] browserVersions = new String[2];
			for(int i = 0; i < 2; i++)
			{
				caps.setCapability("platform", platforms[i]);
				caps.setCapability("version", "48.0");

				driver = new RemoteWebDriver(new URL(URL), caps);
			}
		}
//		if(browserName.equalsIgnoreCase("firefox"))
//		{
//			DesiredCapabilities caps = DesiredCapabilities.firefox();
//			caps.setCapability("platform", "OS X El Capitan 10.11");
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
