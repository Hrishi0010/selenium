package com.shopper_stck.testScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopperStck.GenericUtility.Bse_test;
import com.shopperStck.GenericUtility.listenersUtility;
import com.shopperStg.POM.ddressFormPge;
import com.shopperStg.POM.homePge;
import com.shopperStg.POM.myProfilePge;
import com.shopperStg.POM.myddressPge;

@Listeners(listenersUtility.class)
public class shopper_stck_dd_ddresss_Test extends Bse_test {
	public String sheetnme = "Sheet1";

	@Test(priority = 0)
	public void lunch_shopper_stck() throws IOException {

		homePge homeP = new homePge(driver);
		homeP.getSettingBtn().click();
		homeP.getMyProfileBtn().click();

		myProfilePge profileP = new myProfilePge(driver);
		profileP.getMyddressBtn().click();

		myddressPge ddressP = new myddressPge(driver);
		ddressP.getDddressBtn().click();

		ddressFormPge ddressFormP = new ddressFormPge(driver);
		ddressFormP.getNmeTf().sendKeys(fu.excelFile(sheetnme, 1, 0));
		ddressFormP.getOfficeTf().sendKeys(fu.excelFile(sheetnme, 1, 1));
		ddressFormP.getStreetTf().sendKeys(fu.excelFile(sheetnme, 1, 2));
		ddressFormP.getLndmrkTf().sendKeys(fu.excelFile(sheetnme, 1, 3));
		webdriver_utility.selectbyVlue(ddressFormP.getCountryDD(), fu.propertyFile("country"));
		webdriver_utility.selectbyVlue(ddressFormP.getStteDD(), fu.propertyFile("state"));
		webdriver_utility.selectbyVlue(ddressFormP.getCityTf(), fu.propertyFile("city"));
		ddressFormP.getPincodeTf().sendKeys(fu.excelFile(sheetnme, 1, 4));
		ddressFormP.getPhonenumberTf().sendKeys(fu.excelFile(sheetnme, 1, 5));
		ddressFormP.getaddAddressBtn().click();

	}

}
