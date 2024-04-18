package com.fliplrt.genericUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowHndles {

	public void window(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		for (String child : windows) {
			driver.switchTo().window(child);
		}
	}
}
