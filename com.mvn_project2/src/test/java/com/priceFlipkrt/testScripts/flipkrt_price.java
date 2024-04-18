package com.priceFlipkrt.testScripts;

import org.testng.annotations.Test;

import com.fliplrt.genericUtility.flipkrt_bse_clss;

public class flipkrt_price extends flipkrt_bse_clss {

	@Test
	public void flipkrtPrice() {
		homePge.getSerchBox().sendKeys("iphone");
		homePge.getSubmitBtn().click();
		iphonePge.getIphonePrice().click();
		iphonePge.getIphonePriceText();
		
		windowHndles.window(driver);
		crt.getDdToCrt().click();
		homePge.getSerchBox().sendKeys("vivo");
		homePge.getSubmitBtn().click();

	}
}
