package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageafterloginTeam8 {
	WebDriver driver;
	public HomePageafterloginTeam8(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	//Recommended for You Section
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a/figure/img")
	private WebElement PPEGearMasksSanitizer;
	public WebElement PPEGearMasksSanitizer() {
		return PPEGearMasksSanitizer;
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[3]/div/div[3]/div[2]/div[2]/a/figure/img")
	private WebElement HomelessCarekits;
	public WebElement HomelessCarekits() {
		return HomelessCarekits;
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[3]/div/div[3]/div[2]/div[3]/a/figure/img")
	private WebElement AtHomeActivities;
	public WebElement AtHomeActivities() {
	return AtHomeActivities;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[3]/div/div[3]/div[2]/div[4]/a/figure/img")
	private WebElement Goingtoschoolsafely;
	public WebElement Goingtoschoolsafely() {
	return Goingtoschoolsafely;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[4]/div/div/div/a/figure[1]/img")
	private WebElement CreateAFreeWishList;
	public WebElement CreateAFreeWishList() {
	return CreateAFreeWishList;
	}
	//Explore Our Blog
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[5]/div/div[2]/div[1]/div/figure/a/img")
	private WebElement TheBigDealaboutBigBoxSchoolSupplies;
	public WebElement TheBigDealaboutBigBoxSchoolSupplies() {
	return TheBigDealaboutBigBoxSchoolSupplies;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[5]/div/div[2]/div[2]/div/figure/a/img")
	private WebElement IntroducingOurBacktoSchoolCatalog;
	public WebElement IntroducingOurBacktoSchoolCatalog() {
	return IntroducingOurBacktoSchoolCatalog;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[5]/div/div[2]/div[3]/div/figure/a/img")
	private WebElement HomelessCarePackageIdeasforSummer;
	public WebElement HomelessCarePackageIdeasforSummer() {
	return HomelessCarePackageIdeasforSummer;
	}
	//BrandsWeLove
	@FindBy(xpath="//*[@id=\"brand_logo\"]/div[1]/div/div[1]/li/a/img")
	private WebElement FisherPrice;
	public WebElement FisherPrice() {
	return FisherPrice;
	}
	@FindBy(xpath="//*[@id=\"brand_logo\"]/div[1]/div/div[2]/li/a/img")
	private WebElement Hanes;
	public WebElement Hanes() {
	return Hanes;
	}
	@FindBy(xpath="//*[@id=\"brand_logo\"]/div[1]/div/div[3]/li/a/img")
	private WebElement FORWARD;
	public WebElement FORWARD() {
	return FORWARD;
	}
	@FindBy(xpath="//*[@id=\"brand_logo\"]/div[1]/div/div[4]/li/a/img")
	private WebElement BigBox;
	public WebElement BigBox() {
	return BigBox;
	}
	@FindBy(xpath="//*[@id=\"brand_logo\"]/div[1]/div/div[5]/li/a/img")
	private WebElement WolfCollection;
	public WebElement WolfCollection() {
	return WolfCollection;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[3]/div/div/p/small/a[1]")
	private WebElement disasterreliefsupplies;
	public WebElement disasterreliefsupplies() {
	return disasterreliefsupplies;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[3]/div/div/p/small/a[2]")
	private WebElement ToysAndGames;
	public WebElement ToysAndGames() {
	return ToysAndGames;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[3]/div/div/p/small/a[3]")
	private WebElement HygieneKit;
	public WebElement HygieneKit() {
	return HygieneKit;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[3]/div/div/p/small/a[4]")
	private WebElement Backpacks;
	public WebElement Backpacks() {
	return Backpacks;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[3]/div/div/p/small/a[5]")
	private WebElement SchoolSupplies;
	public WebElement SchoolSupplies() {
	return SchoolSupplies;
	}
	
	//Our Company
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[1]/a")
	private WebElement Blog;
	public WebElement Blog() {
	return Blog;
	}
	
	@FindBy(xpath = "//a[normalize-space(.)='About Us']")
	private WebElement AboutUs;
	public WebElement AboutUs() {
	return AboutUs;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[3]/a")
	private WebElement Carees;
	public WebElement Carees() {
	return Carees;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[4]/a")
	private WebElement PartnerWithUs;
	public WebElement PartnerWithUs() {
	return PartnerWithUs;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[5]/a")
	private WebElement WishlistProgram;
	public WebElement WishlistProgram() {
	return WishlistProgram;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[6]/a")
	private WebElement BusinessBenefits;
	public WebElement BusinessBenefits() {
	return BusinessBenefits;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[7]/a")
	private WebElement EducatorBenefits;
	public WebElement EducatorBenefits() {
	return EducatorBenefits;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[1]/div/ul/li[8]/a")
	private WebElement NonprofitBenefits;
	public WebElement NonprofitBenefits() {
	return NonprofitBenefits;
	}
	//Customer Service
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/a")
	private WebElement MyAccount;
	public WebElement MyAccount() {
	return MyAccount;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[2]/a")
	private WebElement ContactUs;
	public WebElement ContactUs() {
	return ContactUs;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[3]/a")
	private WebElement FAQ;
	public WebElement FAQ() {
	return FAQ;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[4]/a")
	private WebElement PrivacyPolicy;
	public WebElement PrivacyPolicy() {
	return PrivacyPolicy;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[5]/a")
	private WebElement ReturnPolicy;
	public WebElement ReturnPolicy() {
	return ReturnPolicy;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[6]/a")
	private WebElement ShippingPolicy;
	public WebElement ShippingPolicy() {
	return ShippingPolicy;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[2]/ul/li[7]/a")
	private WebElement TermsAndConditions;
	public WebElement TermsAndConditions() {
	return TermsAndConditions;
	}
	//ConnectWithUs
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[1]/a/i")
	private WebElement Facebook;
	public WebElement Facebook() {
	return Facebook;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/a/i")
	private WebElement Twitter;
	public WebElement Twitter() {
	return Twitter;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[3]/a/i")				
	private WebElement LinkedIn;
	public WebElement LinkedIn() {
	return LinkedIn;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[4]/a/i")
	private WebElement Instagram;
	public WebElement Instagram() {
	return Instagram;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[5]/a/i")
	private WebElement Pinterest;
	public WebElement Pinterest() {
	return Pinterest;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[1]/div[2]/div/div[3]/div[2]/ul/li[6]/a/i")
	private WebElement Mail;
	public WebElement Mail() {
	return Mail;
	}
	//Footer of the page links
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a")
	private WebElement YourCCPARights;
	public WebElement YourCCPARights() {
	return YourCCPARights;
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/footer/div[1]/div[2]/div[1]/div[1]/ul/li[2]/a")
	private WebElement DoNotSellMyInformation;
	public WebElement DoNotSellMyInformation() {
	return DoNotSellMyInformation;
	}
	@FindBy(xpath="//<img>[@title='Big Box']")
	private WebElement BigBox_Footer;
	public WebElement BigBox_Footer() {
	return BigBox_Footer;
	}
	@FindBy(xpath="//<img>[@title='Forward']")
	private WebElement Forward_Footer;
	public WebElement Forward_Footer() {
	return Forward_Footer;
	}
	
	}