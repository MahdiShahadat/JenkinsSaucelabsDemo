package com.medialets.CISauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;


public class CorrectPageTest 
{
	WebDriver driver;
	
	@Test
	public void verifyHomePageTitle() throws Exception
	{
		driver = BasePage.startBrowser("Chrome", "https://www.medialets.com/");
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		String pageTitle = homePage.getPageTitle();
		
		Assert.assertTrue(pageTitle.contains("Medialets"));
	}

	@AfterClass
	public void finalTearDown()
	{
		driver.quit();

	}
}
