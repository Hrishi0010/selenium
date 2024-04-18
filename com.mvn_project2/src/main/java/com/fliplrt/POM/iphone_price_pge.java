package com.fliplrt.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iphone_price_pge {

	public iphone_price_pge(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	private WebElement iphonePrice;
	
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]/../../div[2]/div[1]/div/div[1]")
	private WebElement iphonePriceText;

	public WebElement getIphonePrice() {
		return iphonePrice;
	}

	public WebElement getIphonePriceText() {
		return iphonePriceText;
	}
	
	
}
