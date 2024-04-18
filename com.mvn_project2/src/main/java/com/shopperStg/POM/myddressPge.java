package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myddressPge {
	public myddressPge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement dddressBtn;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton')])[2]")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium ')])")
	private WebElement yesBtn;

	public WebElement getYesBtn() {
		return yesBtn;
	}

	public WebElement getDddressBtn() {
		return dddressBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

}
