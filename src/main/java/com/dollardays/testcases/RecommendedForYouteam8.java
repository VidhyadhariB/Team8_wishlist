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

public class RecommendedForYouteam8 extends BaseTest{


@DDDataProvider(datafile="testdata/testdatateam8.xlsx", sheetName="Sheet6", testcaseID="TC1", runmode="Yes")

@Test(dataProvider = "dd-dataprovider", dataProviderClass=TestUtil.class)
public void TC_01_ValidateTheLinksUnderRecommendedForYouSection(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
	
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify the links under Recommended For You section");
	LoginPage loginPage = new LoginPage(driver);
	ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
	Thread.sleep(1000);
	loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);

//Click on PPEGear masks,sanitizer link
	HomePageafterloginTeam8 homePage = new HomePageafterloginTeam8(driver);
	homePage.PPEGearMasksSanitizer().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on PPEGearMasksSanitizer link");
	Thread.sleep(1000);
	String title =driver.getTitle();
	System.out.println("The page title is" +title);
	Thread.sleep(1000);
	driver.navigate().back();
	
//Click on HomelessCarekits link
	homePage.HomelessCarekits().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on HomelessCarekits link");
	Thread.sleep(1000);
	String title1 =driver.getTitle();
	System.out.println("The page title is" +title1);
	driver.navigate().back();
	Thread.sleep(1000);
	
// Click on AtHomeActivities link
	homePage.AtHomeActivities().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on AtHomeActivities link");
	Thread.sleep(1000);
	String title2 =driver.getTitle();
	System.out.println("The page title is" +title2);
	driver.navigate().back();
	Thread.sleep(1000);
	
//Click on Going to school safely link
	homePage.Goingtoschoolsafely().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Clicked on Goingtoschoolsafely link");
	Thread.sleep(1000);
	String title3 =driver.getTitle();
	System.out.println("The page title is" +title3);
	driver.navigate().back();
	Thread.sleep(1000);
	
//  Click on "Create a Free Wishlist" link on "Wishlist" section	
	homePage.CreateAFreeWishList().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Clicked on CreateAFreeWishList link");
	Thread.sleep(1000);
	String title4 =driver.getTitle();
	System.out.println("The page title is" +title4);
	driver.navigate().back();
	Thread.sleep(1000);
	}
}

