package com.shopperStg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ddressFormPge {
	public ddressFormPge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Name")
	private WebElement nmeTf;

	@FindBy(id = "House/Office Info")
	private WebElement officeTf;

	@FindBy(id = "Street Info")
	private WebElement streetTf;

	@FindBy(id = "Landmark")
	private WebElement lndmrkTf;

	@FindBy(id = "Country")
	private WebElement countryDD;

	@FindBy(id = "State")
	private WebElement stteDD;

	@FindBy(id = "City")
	private WebElement cityTf;

	@FindBy(id = "Pincode")
	private WebElement pincodeTf;

	@FindBy(id = "Phone Number")
	private WebElement phonenumberTf;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getNmeTf() {
		return nmeTf;
	}

	public WebElement getOfficeTf() {
		return officeTf;
	}

	public WebElement getStreetTf() {
		return streetTf;
	}

	public WebElement getLndmrkTf() {
		return lndmrkTf;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStteDD() {
		return stteDD;
	}

	public WebElement getCityTf() {
		return cityTf;
	}

	public WebElement getPincodeTf() {
		return pincodeTf;
	}

	public WebElement getPhonenumberTf() {
		return phonenumberTf;
	}
	
	public WebElement getaddAddressBtn() {
		return addAddressBtn;
	}

}
