package com.medialets.CISauceDemo;

import org.openqa.selenium.WebDriver;

public class HomePage
{
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}

}
