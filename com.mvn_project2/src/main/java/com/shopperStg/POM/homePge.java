package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePge {

	public homePge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(@class,'BaseBadge')]")
	private WebElement settingBtn;
	
	@FindBy(xpath = "//li[@role='menuitem']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "(//li[@role='menuitem'])[7]")
	private WebElement logoutBtn;

	public WebElement getSettingBtn() {
		return settingBtn;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	

}
