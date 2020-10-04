package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.HomePageafterloginTeam8;
import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class ConnectWithUsFooterPageteam8 extends BaseTest{
	@DDDataProvider(datafile="testdata/testdatateam8.xlsx", sheetName="Sheet6", testcaseID="TC4", runmode="Yes")

	@Test(dataProvider = "dd-dataprovider", dataProviderClass=TestUtil.class)
	public void TC_03_ValidateTheLinksUnderOurCompanySection(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 4 : Verify the links under Connect With Us section on Footer of the page");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		Thread.sleep(1000);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
	
			
	//Click on The Facebook link
		HomePageafterloginTeam8 homePage = new HomePageafterloginTeam8(driver);
		String oldTab = driver.getWindowHandle();
		homePage.Facebook().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on Facebook link");
		Thread.sleep(2000);
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(1));
	    String FacebookURL = driver.getCurrentUrl();
	    System.out.println("The current URL is :" +FacebookURL);
	    String title =driver.getTitle();
		System.out.println("The page title is" +title);
		Thread.sleep(1000);
	    // Do what you want here, you are in the new tab
	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on The Twitter link
		homePage.Twitter().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on Twitter link");
		Thread.sleep(1000);
		ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
		    // change focus to new tab
		    driver.switchTo().window(newTab1.get(1));
		    String TwitterURL = driver.getCurrentUrl();
		    System.out.println("The current URL is :" +TwitterURL);
		    String title1 =driver.getTitle();
			System.out.println("The page title is" +title1);
			Thread.sleep(1000);
		    // Do what you want here, you are in the new tab
		    driver.close();
		    // change focus back to old tab
		    driver.switchTo().window(oldTab);
			driver.navigate().back();
			Thread.sleep(1000);
		
	//Click on The LinkedIn link
		homePage.LinkedIn().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on LinkedIn link");
		Thread.sleep(1000);
		ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
	    // change focus to new tab
	    driver.switchTo().window(newTab2.get(1));
	    String LinkedInURL = driver.getCurrentUrl();
	    System.out.println("The current URL is :" +LinkedInURL);
	    String title2 =driver.getTitle();
		System.out.println("The page title is" +title2);
		Thread.sleep(1000);
	    // Do what you want here, you are in the new tab
	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
		Thread.sleep(1000);	

	//Click on The Instagram link
		homePage.Instagram().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Clicked on Instagram link");
		Thread.sleep(2000);
		ArrayList<String> newTab3 = new ArrayList<String>(driver.getWindowHandles());
	    // change focus to new tab
	    driver.switchTo().window(newTab3.get(1));
	    String InstagramURL = driver.getCurrentUrl();
	    System.out.println("The current URL is :" +InstagramURL);
	    String title3 =driver.getTitle();
		System.out.println("The page title is" +title3);
		Thread.sleep(1000);
	    // Close the new tab
	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
		//driver.navigate().back();
		Thread.sleep(1000);	
		
	//Click on The Pinterest link
		homePage.Pinterest().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Clicked on Pinterest link");
		Thread.sleep(1000);
		ArrayList<String> newTab4 = new ArrayList<String>(driver.getWindowHandles());
	    // change focus to new tab
	    driver.switchTo().window(newTab4.get(1));
	    String PinterestURL = driver.getCurrentUrl();
	    System.out.println("The current URL is :" +PinterestURL);
	    String title4 =driver.getTitle();
		System.out.println("The page title is" +title4);
		Thread.sleep(1000);
	    // Do what you want here, you are in the new tab
	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
		//driver.navigate().back();
		Thread.sleep(1000);	

		
	//Click on The Mail link
		homePage.Mail().isDisplayed();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Mail link is displaying");
		System.out.println("The Mail icon is displaying");
		Thread.sleep(1000);
	    
	//Click on The YourCCPARights link
		homePage.YourCCPARights().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Clicked on YourCCPARights link");
		Thread.sleep(1000);
		String title6 =driver.getTitle();
		System.out.println("The page title is" +title6);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	
		
	//Click on The DoNotSellMyInformation link
		homePage.DoNotSellMyInformation().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : Clicked on DoNotSellMyInformation link");
		Thread.sleep(1000);
		String title7 =driver.getTitle();
		System.out.println("The page title is" +title7);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	
}
}
