package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myProfilePge {
	public myProfilePge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myddressBtn;

	public WebElement getMyddressBtn() {
		return myddressBtn;
	}
	
	
}
