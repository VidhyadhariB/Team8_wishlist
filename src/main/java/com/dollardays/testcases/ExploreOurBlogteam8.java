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

public class ExploreOurBlogteam8 extends BaseTest{
	@DDDataProvider(datafile="testdata/testdatateam8.xlsx", sheetName="Sheet6", testcaseID="TC2", runmode="Yes")

	@Test(dataProvider = "dd-dataprovider", dataProviderClass=TestUtil.class)
	public void TC_02_ValidateTheLinksUnderExploreOurBlogSection(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 2 : Verify the links under extends Explore Our Blog section");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		Thread.sleep(1000);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);

			
	//Click on The Big Deal about BigBox School Supplies link
		HomePageafterloginTeam8 homePage = new HomePageafterloginTeam8(driver);
		homePage.TheBigDealaboutBigBoxSchoolSupplies().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on TheBigDealaboutBigBoxSchoolSupplies link");
		Thread.sleep(1000);
		String title =driver.getTitle();
		System.out.println("The page title is" +title);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on IntroducingOurBacktoSchoolCatalog link
		homePage.IntroducingOurBacktoSchoolCatalog().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Clicked on the IntroducingOurBacktoSchoolCatalog link");
		Thread.sleep(1000);
		String title1 = driver.getTitle();
		System.out.println("The page title is" +title1);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on HomelessCarePackageIdeasforSummer link
		homePage.HomelessCarePackageIdeasforSummer().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Clicked on the HomelessCarePackageIdeasforSummer link");
		Thread.sleep(1000);
		String title2 = driver.getTitle();
		System.out.println("The page title is" +title2);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on disasterreliefsupplies link
		homePage.disasterreliefsupplies().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Clicked on the disasterreliefsupplies link");
		Thread.sleep(1000);
		String title3 = driver.getTitle();
		System.out.println("The page title is" +title3);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on ToysAndGames link
		homePage.ToysAndGames().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Clicked on the ToysAndGames link");
		Thread.sleep(1000);
		String title4 = driver.getTitle();
		System.out.println("The page title is" +title4);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on HygieneKit link
		homePage.HygieneKit().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Clicked on the HygieneKit link");
		Thread.sleep(1000);
		String title5 = driver.getTitle();
		System.out.println("The page title is" +title5);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	//Click on Backpacks link
		homePage.Backpacks().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Clicked on the Backpacks link");
		Thread.sleep(1000);
		String title6 = driver.getTitle();
		System.out.println("The page title is" +title6);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	
		//Click on SchoolSupplies link
		homePage.SchoolSupplies().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Clicked on the SchoolSupplies link");
		Thread.sleep(1000);
		String title7 = driver.getTitle();
		System.out.println("The page title is" +title7);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);		
		
}
}
