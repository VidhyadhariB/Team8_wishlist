package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollardays.testcases.BaseTest;

public class Wishlistpageaftersigninteam8 extends BaseTest{
	
	WebDriver driver;

	public Wishlistpageaftersigninteam8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		//Page Factory - or;
		@FindBy(xpath = "//a[normalize-space(.)='Wishlist']")
		private WebElement wishlist;
	
		@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[2]/ul/li[3]/a" )
		private WebElement createWishlist;
		
		@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[3]/h5/a" )
		private WebElement manageWishlist;
		
		@FindBy(xpath = "/html/body/form/footer/div[3]/div/p/input")
		private WebElement cookiePopup;
		
		public WebElement getCookiePopup() {
			return cookiePopup;
		}
		

		public WebElement getWishlist() {
			return wishlist;
		}


		public WebElement getCreateWishlist() {
			return createWishlist;
		}


		public WebElement getManageWishlist() {
			return manageWishlist;
		}

		}
		

	
		

