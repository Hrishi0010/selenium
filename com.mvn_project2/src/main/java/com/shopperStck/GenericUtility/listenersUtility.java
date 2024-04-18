package com.shopperStck.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersUtility implements ITestListener, ISuiteListener, frmeWork_constnts {
	jvUitility ju = new jvUitility();

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) Bse_test.itestListners;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPth + ju.systemDte_time() + ".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
