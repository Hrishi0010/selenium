package com.shopper_stck.testScripts;

import org.testng.annotations.Test;

import com.shopperStck.GenericUtility.Bse_test;
import com.shopperStg.POM.myProfilePge;
import com.shopperStg.POM.myddressPge;

public class delete_ddress_from_my_ddress extends Bse_test {
	@Test
	public void delete_ddress() throws InterruptedException {
		homeP.getSettingBtn().click();
		homeP.getMyProfileBtn().click();

		myProfilePge profilePge = new myProfilePge(driver);
		profilePge.getMyddressBtn().click();

		myddressPge ddressPge = new myddressPge(driver);
		ddressPge.getDeleteBtn().click();
		ddressPge.getYesBtn().click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

	}

}
