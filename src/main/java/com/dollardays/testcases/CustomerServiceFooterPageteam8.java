package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.HomePageafterloginTeam8;
import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class CustomerServiceFooterPageteam8 extends BaseTest{
	
	@DDDataProvider(datafile="testdata/testdatateam8.xlsx", sheetName="Sheet6", testcaseID="TC3", runmode="Yes")

	@Test(dataProvider = "dd-dataprovider", dataProviderClass=TestUtil.class)
	public void TC_03_ValidateTheLinksUnderOurCompanySection(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 3 : Verify the links under OurCompany section on Footer of the page");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		Thread.sleep(1000);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
			
	//Click on The MyAccount link
		HomePageafterloginTeam8 homePage = new HomePageafterloginTeam8(driver);
		homePage.MyAccount().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on MyAccount link");
		Thread.sleep(1000);
		String title =driver.getTitle();
		System.out.println("The page title is" +title);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on The ContactUs link
		homePage.ContactUs().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on ContactUs link");
		Thread.sleep(1000);
		String title1 =driver.getTitle();
		System.out.println("The page title is" +title1);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	
	
//Click on The FAQ link
		homePage.FAQ().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on FAQ link");
		Thread.sleep(1000);
		String title2 =driver.getTitle();
		System.out.println("The page title is" +title2);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	

//Click on The FAQ link
		homePage.FAQ().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Clicked on FAQ link");
		Thread.sleep(1000);
		String title3 =driver.getTitle();
		System.out.println("The page title is" +title3);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	


	//Click on The PrivacyPolicy link
	homePage.PrivacyPolicy().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Clicked on PrivacyPolicy link");
	Thread.sleep(1000);
	String title4 =driver.getTitle();
	System.out.println("The page title is" +title4);
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);

	//Click on The ReturnPolicy link
	homePage.ReturnPolicy().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Clicked on ReturnPolicy link");
	Thread.sleep(1000);
	String title5 =driver.getTitle();
	System.out.println("The page title is" +title5);
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);

	//Click on The ShippingPolicy link
	homePage.ShippingPolicy().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Clicked on ShippingPolicy link");
	Thread.sleep(1000);
	String title6 =driver.getTitle();
	System.out.println("The page title is" +title6);
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);

	//Click on The TermsAndConditions link
	homePage.TermsAndConditions().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 9  : Clicked on TermsAndConditions link");
	Thread.sleep(1000);
	String title7 =driver.getTitle();
	System.out.println("The page title is" +title7);
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);	
}
}