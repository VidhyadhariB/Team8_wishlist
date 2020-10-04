
package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.MyWishlistPageTeam8aftersigninS;
import com.dollardays.pages.Signinpageteam8s;
import com.dollardays.pages.Wishlistpageaftersigninteam8;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class WishlistTestCaseaftersigninteam8 extends BaseTest{

	@DDDataProvider(datafile = "testdata/testdatateam8.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void checkForExistingWishList(Hashtable<String, String> datatable) throws Exception{
		
		VideoRecorder_utlity.startRecord("WishListTestRecording");//Starting point of video recording
		Wishlistpageaftersigninteam8 wishlistPage = new Wishlistpageaftersigninteam8(driver);
		MyWishlistPageTeam8aftersigninS mywishListpage = new MyWishlistPageTeam8aftersigninS(driver);
		
		//Login to dollardays.com and click on wishlist
		login(datatable,wishlistPage);
		
		//Click on manage wishlist and edit organization details
		clickOnMyWishListEditOrganization(mywishListpage);
		Thread.sleep(1000);
		
		//Click on  wishlist and edit project/event details
		clickOnMyWishListEditProject(wishlistPage, mywishListpage);
		Thread.sleep(3000);
		
		//Click on  wishlist and edit products
		clickOnMyWishlistEditWishlistProducts(wishlistPage, mywishListpage);
		Thread.sleep(1000);
				
		//Click on  wishlist and view orders
		
		clickOnMyWishlistViewWishlistOrders(wishlistPage, mywishListpage);
		
		Thread.sleep(2000);
		
		VideoRecorder_utlity.stopRecord();
		
	}
	
	private void login(Hashtable<String, String> datatable,Wishlistpageaftersigninteam8 wishlistPage)
			throws InterruptedException, GeneralSecurityException, UnsupportedEncodingException {
		//1. Signin with valid creds 
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify Wishlist functionality");
		Signinpageteam8s loginPage = new Signinpageteam8s(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);
		
		//2. Click of WishList
		wishlistPage.getWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Clicked on Wishlist Header");
		Thread.sleep(1000);
		
		wishlistPage.getCreateWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Clicked on create a wishlist");
		
		//3. Check if Manage link is present
		wishlistPage.getManageWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on manage wishlist");
	}
	
	private void clickOnMyWishListEditOrganization(MyWishlistPageTeam8aftersigninS mywishListpage) throws InterruptedException {
		mywishListpage.getEditOrg().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Clicked on edit organization");
		Thread.sleep(1000);
		
		mywishListpage.getOrgName().clear();
		mywishListpage.getOrgName().sendKeys("automation");
		ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Updated Organization name");
		Thread.sleep(1000);
		
		mywishListpage.getOrgWeb().clear();
		mywishListpage.getOrgWeb().sendKeys("www.google.com");
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Updated Organization url" );
		Thread.sleep(1000);
		
		mywishListpage.getContName().clear();
		mywishListpage.getContName().sendKeys("Automation Name");
		ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Updated Contact Name");
		Thread.sleep(1000);
		
		mywishListpage.getContEmail().clear();
		mywishListpage.getContEmail().sendKeys("automation@gmail.com");
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : Updated organization email");
		Thread.sleep(1000);
		
		mywishListpage.getReccopyEmail().clear();
		mywishListpage.getReccopyEmail().sendKeys("abcd@gmail.com");
		ExtentTestManager.getTest().log(Status.PASS, "Step 10  : Updated Email receipt copies ");
		Thread.sleep(1000);
		
		mywishListpage.getAddLine().clear();
		mywishListpage.getAddLine().sendKeys("afadsfadf213124");
		ExtentTestManager.getTest().log(Status.PASS, "Step 11  : Updated Address line 1 " );
		Thread.sleep(1000);
		
		mywishListpage.getAddLine2().clear();
		mywishListpage.getAddLine2().sendKeys("4701587kljl;a");
		ExtentTestManager.getTest().log(Status.PASS, "Step 12  : Updated Address line2 ");
		Thread.sleep(1000);
		
		mywishListpage.getCity().clear();
		mywishListpage.getCity().sendKeys("Automation City");
		ExtentTestManager.getTest().log(Status.PASS, "Step 13  : Updated city ");
		Thread.sleep(1000);
		
		Select drpState = new Select(mywishListpage.getState());
		//mywishListpage.getOrgName().clear();
		drpState.selectByVisibleText("California");
		ExtentTestManager.getTest().log(Status.PASS, "Step 14  : Changed state from dropdown");
		Thread.sleep(1000);
		
		mywishListpage.getZip().clear();
		mywishListpage.getZip().sendKeys("780870");
		ExtentTestManager.getTest().log(Status.PASS, "Step 15  : Updated Zip code ");
		Thread.sleep(1000);
		
		mywishListpage.getPhNum().clear();
		mywishListpage.getPhNum().sendKeys("1111111111");
		ExtentTestManager.getTest().log(Status.PASS, "Step 16  : Updated Phone Number " );
		Thread.sleep(1000);
		
		mywishListpage.getExtn().clear();
		mywishListpage.getExtn().sendKeys("780870");
		ExtentTestManager.getTest().log(Status.PASS, "Step 17  : Updated phone Extension ");
		Thread.sleep(1000);
		
		mywishListpage.getDesOrg().clear();
		mywishListpage.getDesOrg().sendKeys("Automation testing description.");
		ExtentTestManager.getTest().log(Status.PASS, "Step 18  : Updated Describe organization ");
		Thread.sleep(1000);
		
		mywishListpage.getUpdtInfo().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 19  : Clicked on update information ");
		
	}
	private void clickOnMyWishListEditProject(Wishlistpageaftersigninteam8 wishlistPage, MyWishlistPageTeam8aftersigninS mywishListpage)
			throws InterruptedException {
		wishlistPage.getWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 20  : Clicked on Wishlist Header");
		Thread.sleep(1000);
		
		mywishListpage.getMyWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 21  : Clicked on mywishlist");
		Thread.sleep(1000);
		
		//5. Check for Your Project 
		mywishListpage.getYourProj().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 22  : Clicked on Your project");
		Thread.sleep(1000);
		
		mywishListpage.getProjEvent().clear();
		mywishListpage.getProjEvent().sendKeys("first automation");
		ExtentTestManager.getTest().log(Status.PASS, "Step 23  : Updated Project name");
		Thread.sleep(1000);
		
		mywishListpage.getProjDate().clear();
		mywishListpage.getProjDate().sendKeys(getCurrentDate());
		ExtentTestManager.getTest().log(Status.PASS, "Step 24  : Updated Project date");
		Thread.sleep(1000);
		
		mywishListpage.getProjDesc().clear();
		mywishListpage.getProjDesc().sendKeys("first automation project description");
		ExtentTestManager.getTest().log(Status.PASS, "Step 25  : Updated Project description");
		Thread.sleep(1000);
				
		mywishListpage.getThankMsg().clear();
		mywishListpage.getThankMsg().sendKeys("first automation project description");
		ExtentTestManager.getTest().log(Status.PASS, "Step 26  : Updated thank you message");
		Thread.sleep(1000);
		
		//mywishListpage.getUploadPhoto().clear();
		//mywishListpage.getUploadPhoto().sendKeys("/Users/shilpasupradeep/Desktop/IMG_8852.jpg");
		uploadFile(mywishListpage.getUploadPhoto());
		ExtentTestManager.getTest().log(Status.PASS, "Step 27  : Uploaded photo");
		Thread.sleep(1000);
		
		mywishListpage.getUpdtInfo().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 28  : Updated information under proj");		
		
	}
	
	private void clickOnMyWishlistEditWishlistProducts(Wishlistpageaftersigninteam8 wishlistPage, MyWishlistPageTeam8aftersigninS mywishListpage)
			throws InterruptedException {
		wishlistPage.getWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 29  : Clicked on Wishlist Header");
		Thread.sleep(2000);
		
		mywishListpage.getMyWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 30  : Clicked on mywishlist");
		Thread.sleep(1000);
		
		mywishListpage.getYourWishlistProducts().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 31  : Clicked on Your project");
	}


	public void clickOnMyWishlistViewWishlistOrders(Wishlistpageaftersigninteam8 wishlistPage, MyWishlistPageTeam8aftersigninS mywishListpage)
			throws InterruptedException {
		wishlistPage.getWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 32  : Clicked on Wishlist Header");
		Thread.sleep(2000);
		
		mywishListpage.getMyWishlist().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 33  : Clicked on mywishlist");
		Thread.sleep(1000);
		
		//mywishListpage.getCookBtn().click();
		closeCookieStickyPopup(mywishListpage.getCookBtn());
        ExtentTestManager.getTest().log(Status.PASS, "Step 34 : Close cookie popup");
		Thread.sleep(2000);
		
		WebElement we = mywishListpage.getWishlistOrder();
		we.click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 35  : Clicked on Wishlist orders");
		Thread.sleep(2000);
		
		mywishListpage.getStartDate().clear();
		mywishListpage.getStartDate().sendKeys("10/09/2018");
		ExtentTestManager.getTest().log(Status.PASS, "Step 36  : Update start date");
		Thread.sleep(2000);
		
		mywishListpage.getEndDate().clear();
		mywishListpage.getEndDate().sendKeys("10/09/2019");
		ExtentTestManager.getTest().log(Status.PASS, "Step 37  : Update end date");
		Thread.sleep(2000);
		
		mywishListpage.getSubmit().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 38  : Clicked on submit");
	}

	
	private static String getCurrentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now);
	}
	
	
	private void uploadFile(WebElement uploadElement) throws InterruptedException {
		 uploadElement.sendKeys(System.getProperty ("user.dir") +"//testdata//index.jpg");
		 Thread.sleep(3000);
	}
	
	private void closeCookieStickyPopup(WebElement cookieElement) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cookieElement);
		
	}
	
	
}