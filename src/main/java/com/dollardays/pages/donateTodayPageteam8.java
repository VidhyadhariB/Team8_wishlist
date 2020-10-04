package com.dollardays.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollardays.testcases.BaseTest;

public class donateTodayPageteam8 extends BaseTest{
	WebDriver driver;

	public donateTodayPageteam8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space(.)='Wishlist']")
	private WebElement wishList;
	@FindBy( linkText = "Donate Today")
	private WebElement donateToday;

	public WebElement getWishList() {
		return wishList;
	}
	public WebElement getDonateToday() {
		return donateToday;
	}
	//********************5
	@FindBy(xpath = "//a[contains(text(),'Create a Wishlist')]")
	private WebElement createWishListButton1;
	public WebElement getWishListButton1() {
		return wishList;
	}
	 //************
	
	@FindBy( xpath = "//input[@placeholder='Search for items in bulk']")
	
	private WebElement searchButton1;
	public WebElement getSearchBar() {
		return searchButton1;
	}	
	
	@FindBy( xpath = "//span[contains(text(),'wipes')]")
	
	private WebElement wipesOption;
	public WebElement getWipesOption() {
		return wipesOption;
	}	
		
	@FindBy( xpath = "//a[contains(text(),'Create a Wishlist')]")
	private WebElement createWishListButton;
	public WebElement getWishListButton() {
		return createWishListButton1;
	}
	//********************
	 
		
			 
			
		@FindBy( xpath = "//input[@placeholder='City, state and/or zip code']")
		private WebElement searchButton2;
		public WebElement getsearchButton2() {
			return searchButton2;
		}
		
		//WebElement alert1 = driver.findElement(By.xpath("//div[@class='cookie-bar-btn']"));
		//alert1.click();
		//driver.switchTo().alert().accept();
		//crated by A
		@FindBy( xpath = "//div[@class='cookie-bar-btn']")
		private WebElement privacyPolicyAlert;
		
		@FindBy( xpath = "/html/body/div[3]/div/div/div[3]/div/input")
		
		private WebElement searchCity;
		public WebElement getsearchCity() {
			return  searchCity;
		}
		
		//searchCity.sendKeys("Chandler");
		@FindBy( xpath = "/html/body/div[3]/div/div/div[4]/div/button")
		private WebElement searchButton3;
		public WebElement getsearchButton3() {
			return searchButton3;
		}
		public WebElement getPrivacyPolicyAlert() {
			return privacyPolicyAlert;
		}
		public void setPrivacyPolicyAlert(WebElement privacyPolicyAlert) {
			this.privacyPolicyAlert = privacyPolicyAlert;
		}
		
}
