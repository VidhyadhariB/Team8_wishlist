package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollardays.testcases.BaseTest;

public class MyWishlistPageTeam8aftersigninS extends BaseTest{
	
	WebDriver driver;

	public MyWishlistPageTeam8aftersigninS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		//Page Factory - or;
		@FindBy(xpath = "//a[normalize-space(.)='Wishlist']")
		private WebElement wishlist;
	
		//create a wishlist 
		@FindBy(xpath = "//a[normalize-space(.)='Create a Wishlist']" )
		private WebElement createWishlist;
		
		//Mangewishlist
		@FindBy(xpath = "//a[normalize-space(.)='Click here to manage']")
		private WebElement manageWishlist;
		
		//closing alert box
		@FindBy(className = "cookie-bar__close")
		private WebElement cookBtn;
		
		//Your organization
		@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[1]/div[1]/div/h5/a")
		private WebElement editOrg;

		//Orgranization's Name: *
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtOrgName\"]")
		private WebElement orgName;
		
		//Orgranization's Website:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtOrgWeb\"]")
		private WebElement orgWeb;
		
		//Contact Name:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtContName\"]")
		private WebElement contName;
		
		//Contact Email Address:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtEmail\"]")
		private WebElement contEmail;
		
		//Email Receipt Copies to::
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtEmailCopy\"]")
		private WebElement reccopyEmail;
		
		//Address Line 1: *:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtAdd1\"]")
		private WebElement addLine;
		
		//Address Line 2:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtAdd2\"]")
		private WebElement addLine2;
		
		//City:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtCity\"]")
		private WebElement city;
		
		//State: *:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_ddlstate\"]")
		private WebElement state;
		
		
		
		//Zip Code: *
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtZip\"]")
		private WebElement zip;
		
		//Phone Number: *
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtPhone\"]")
		private WebElement phNum;
		
		//Extension:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtExten\"]")
		private WebElement extn;
				
		//Describe your organization:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtorginfo\"]")
		private WebElement desOrg;
				
		//Update information:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_btnOrgUpdate\"]")
		private WebElement updtInfo;
		
		//YOUR PROJECT/EVENT
		@FindBy(xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[1]/div[2]/div/h5/a")
		private WebElement yourProj;

		//YOUR PROJECT/EVENT
		@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtprojectname\"]")
		private WebElement projEvent;
		
		//Project or Event Date:
		@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txteventdate\"]")
		private WebElement projDate;
		
		//Describe your project and/or event:*
		@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtMission\"]")
		private WebElement projDesc;
		
		//Thank you message for donors:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtThankMsg\"]")
		private WebElement thankMsg;
				
		//Your Wishlist Logo or Photo:
		//@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtlogo\"]")
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_fUpLoadImage\"]")
		private WebElement uploadPhoto;
		
		@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtlogo\"]")
		private WebElement uploadedFileInfo;
		
		public WebElement getUploadedFileInfo() {
			return uploadedFileInfo;
		}

		//Update information2:
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_btnOrgUpdate\"]")
		private WebElement updtInfo2;
		
		//my wishlist:
		@FindBy (xpath = "/html/body/header/div/div/div/div[3]/div/ul/li[2]/ul/li[3]/a")
		private WebElement myWishlist;
		
		//update YOUR WISHLIST PRODUCTS
		@FindBy (xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[2]/div[1]/div/h5/a")
		private WebElement yourWishlistProducts;
		
		//view wishlist orders
		//@FindBy (xpath = "/html/body/div[2]/div/section/div/div[3]/div/div[2]/div/div[2]/div[2]/div/h5/a")
		@FindBy(xpath = "//a[normalize-space(.)='View all']")
		private WebElement wishlistOrder;
		
		
		//click on start date
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtStartDate\"]")
		private WebElement startDate;
		
		//click on End date
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_txtEndDate\"]")
		private WebElement endDate;
		
		//click on submit
		@FindBy (xpath = "//*[@id=\"ctl00_cphContent_btnFetchOrders\"]")
		private WebElement submit;
		
		
		public WebElement getMyWishlist() {
			return myWishlist;
		}

		public WebElement getWishlist() {
			return wishlist;
		}


		public WebElement getCreateWishlist() {
			return createWishlist;
		}

		
		public WebElement getCookBtn() {
			return cookBtn;
		}

		public WebDriver getDriver() {
			return driver;
		}


		public WebElement getManageWishlist() {
			return manageWishlist;
		}


		public WebElement getEditOrg() {
			return editOrg;
		}


		public WebElement getOrgName() {
			return orgName;
		}


		public WebElement getOrgWeb() {
			return orgWeb;
		}


		public WebElement getContName() {
			return contName;
		}


		public WebElement getContEmail() {
			return contEmail;
		}


		public WebElement getReccopyEmail() {
			return reccopyEmail;
		}


		public WebElement getAddLine() {
			return addLine;
		}


		public WebElement getAddLine2() {
			return addLine2;
		}


		public WebElement getCity() {
			return city;
		}


		public WebElement getState() {
			return state;
		}


		public WebElement getZip() {
			return zip;
		}


		public WebElement getPhNum() {
			return phNum;
		}


		public WebElement getExtn() {
			return extn;
		}


		public WebElement getDesOrg() {
			return desOrg;
		}


		public WebElement getUpdtInfo() {
			return updtInfo;
		}


		public WebElement getYourProj() {
			return yourProj;
		}


		public WebElement getProjEvent() {
			return projEvent;
		}


		public WebElement getProjDate() {
			return projDate;
		}


		public WebElement getProjDesc() {
			return projDesc;
		}


		public WebElement getThankMsg() {
			return thankMsg;
		}


		public WebElement getUploadPhoto() {
			return uploadPhoto;
		}


		public WebElement getUpdtInfo2() {
			return updtInfo2;
		}

		public WebElement getYourWishlistProducts() {
			return yourWishlistProducts;
		}

		public WebElement getWishlistOrder() {
			return wishlistOrder;
		}

		public WebElement getStartDate() {
			return startDate;
		}

		public WebElement getEndDate() {
			return endDate;
		}

		public WebElement getSubmit() {
			return submit;
		}
		
		
		
		
}
