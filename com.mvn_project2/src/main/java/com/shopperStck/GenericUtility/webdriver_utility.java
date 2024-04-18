package com.shopperStck.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class webdriver_utility implements frmeWork_constnts {
	Select sel;
	File temp;
	File dest;
	WebDriver driver;
	jvUitility ju = new jvUitility();

	public void tke_Webpge_screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		temp = ts.getScreenshotAs(OutputType.FILE);
		dest = new File(screenshotPth + ju.systemDte_time() + ".png");
		FileHandler.copy(temp, dest);
	}

	public void tke_webElement_screenshot(WebElement ele) throws IOException {
		temp = ele.getScreenshotAs(OutputType.FILE);
		dest = new File(screenshotPth + ju.systemDte_time() + ".png");
		FileHandler.copy(temp, dest);

	}

	public void JvScript_executor(String key, WebElement ele) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript(key, ele);
	}

	public void selectbyIndex(WebElement ele, int vlue) {
		sel = new Select(ele);
		sel.selectByIndex(vlue);

	}

	public void selectbyVlue(WebElement ele, String vlue) {
		sel = new Select(ele);
		sel.selectByValue(vlue);

	}

	public void selectbyVisibletext(WebElement ele, String vlue) {
		sel = new Select(ele);
		sel.selectByVisibleText(vlue);

	}

	public void deselectbyIndex(WebElement ele, int vlue) {
		sel = new Select(ele);
		sel.deselectByIndex(vlue);

	}

	public void deselectbyVlue(WebElement ele, String vlue) {
		sel = new Select(ele);
		sel.deselectByValue(vlue);

	}

	public void deselectbyVisibleText(WebElement ele, String vlue) {
		sel = new Select(ele);
		sel.deselectByVisibleText(vlue);

	}

	public void deselectLL(WebElement ele) {
		sel = new Select(ele);
		sel.deselectAll();
	}
}
