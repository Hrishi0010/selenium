package com.fliplrt.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePgeFlipkrt {

	public homePgeFlipkrt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Search for ')]")
	private WebElement serchBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	public WebElement getSerchBox() {
		return serchBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
