package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) // Rule-3: Object Initialization
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignlink;

	@FindBy(linkText = "More")
	private WebElement moreLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	
	@FindBy(linkText = "Products")
	private WebElement prodLink;
	
	@FindBy(linkText="Leads")
	private WebElement LeadsLink;
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement TTickleLink;
	
	
	@FindBy(linkText="Calendar")
	private WebElement calLink;
	
	public WebElement getCalLink() {
		return calLink;
	}
	
	
	@FindBy(linkText="Opportunities")
	private WebElement oppLink;
	
	public WebElement getOppLink() {
		return oppLink;
	}
	public WebElement getTTickleLink() {
		return TTickleLink;
	}
	public WebElement getLeadsLink() {
		return LeadsLink;
	}

	public WebElement getProdLink() {
		return prodLink;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getCampaignlink() {
		return campaignlink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}
	
	
	
	public void navigateToCampaignPage() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();
		campaignlink.click();

	}

	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signOutLink.click();
	}

}
