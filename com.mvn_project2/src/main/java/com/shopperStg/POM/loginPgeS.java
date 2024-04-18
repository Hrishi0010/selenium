package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPgeS {

	public loginPgeS(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emilID;

	@FindBy(id = "Password")
	private WebElement psswordID;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmilID() {
		return emilID;
	}

	public WebElement getPsswordID() {
		return psswordID;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
