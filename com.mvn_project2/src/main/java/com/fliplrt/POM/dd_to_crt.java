package com.fliplrt.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dd_to_crt {

	public dd_to_crt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement ddToCrt;

	public WebElement getDdToCrt() {
		return ddToCrt;
	}

	
}
