package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePge {

	public welcomePge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "loginBtn")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}

