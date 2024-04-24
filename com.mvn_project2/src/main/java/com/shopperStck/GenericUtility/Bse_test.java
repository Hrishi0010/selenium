package com.shopperStck.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shopperStg.POM.homePge;
import com.shopperStg.POM.loginPgeS;
import com.shopperStg.POM.welcomePge;

public class Bse_test {

	public WebDriver driver;
	public static WebDriver itestListners;
	public file_Utility fu = new file_Utility();
	public webdriver_utility webdriver_utility = new webdriver_utility();
	public ExtentSparkReporter extentR;
	public ExtentReports report;
	public ExtentTest test;
	public jvUitility jUtility = new jvUitility();
	public homePge homeP;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
		extentR = new ExtentSparkReporter("./Reports/" + jUtility.systemDte_time() + ".html");
	}

	@AfterSuite
	public void fterSuite() {
		System.out.println("fter Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");

	}

	@AfterTest
	public void fterTest() {
		System.out.println("fter Suite");

	}

	@BeforeClass
	public void beforeClss() throws IOException {
		report = new ExtentReports();
		report.attachReporter(extentR);
		test = report.createTest("demo");
//		String url = System.getProperty("url");

//		String browser = System.getProperty("browser");

		String url = fu.propertyFile("url");
		String browser = fu.propertyFile("browser");
		System.out.println("before Clss");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("plese enter vlid browser nme");
		}
		itestListners = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		homeP = new homePge(driver);

	}

	@AfterClass
	public void fterClss() {
		System.out.println("fter Clss");

		driver.quit();
		report.flush();
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("before Method");
		welcomePge welcomeP = new welcomePge(driver);
		welcomeP.getLoginBtn().click();

		loginPgeS loginP = new loginPgeS(driver);
		loginP.getEmilID().sendKeys(fu.propertyFile("emil"));
		loginP.getPsswordID().sendKeys(fu.propertyFile("pssword"));
		loginP.getLoginBtn().click();

	}

	@AfterMethod
	public void fterMethod() throws InterruptedException {
		System.out.println("fter Method");
		Thread.sleep(3000);
		homeP.getSettingBtn().click();
		homeP.getLogoutBtn().click();

	}

}
