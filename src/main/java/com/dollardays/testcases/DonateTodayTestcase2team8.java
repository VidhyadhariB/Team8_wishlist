package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.SearchPage;
import com.dollardays.pages.donateTodayPageteam8;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class DonateTodayTestcase2team8 extends BaseTest{
	SoftAssert softAssert = new SoftAssert();
	
	@DDDataProvider(datafile = "testdata/testdatateam8.xlsx", sheetName = "Sheet5",  testcaseID = "TC4", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_04_verifySearchButton(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 4 : Verify Search button");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		Thread.sleep(1000);
		System.out.println(datatable.get("UserName"));
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(2000);		
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on Wishlist drop down");
        donateTodayPageteam8 topMenuBar = new donateTodayPageteam8(driver);	
        topMenuBar.getWishList().click();
        Thread.sleep(1000);
        
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on the donate today option");
		topMenuBar.getDonateToday().click();
		Thread.sleep(1000);
		
	
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on the search button option");
		topMenuBar.getSearchBar().click();
		Thread.sleep(1000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Clicked on the wipes  option");
		topMenuBar.getWipesOption().click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Navigate back to previous page");
		topMenuBar.getWishListButton().click();
		Thread.sleep(1000);
		
		softAssert.assertTrue(driver.getTitle().contains("Wishlist"), "Wishlist page title is not matching");
		softAssert.assertAll();
		loginPage.getUserDrodown().click();
		Thread.sleep(500);
		loginPage.getLogoutBtn().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on LogOut");
	}


}
