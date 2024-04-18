package com.fliplrt.genericUtility;

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

import com.fliplrt.POM.dd_to_crt;
import com.fliplrt.POM.homePgeFlipkrt;
import com.fliplrt.POM.iphone_price_pge;

public class flipkrt_bse_clss {

	public WebDriver driver;
	public flipkrt_file_utility fileUtility = new flipkrt_file_utility();
	public windowHndles windowHndles = new windowHndles();
	public dd_to_crt crt;
	public homePgeFlipkrt homePge;
	public iphone_price_pge iphonePge;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite");
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

		String url = fileUtility.propertyFile("url");
		String browser = fileUtility.propertyFile("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("plese enter vlid browser nme");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		homePge = new homePgeFlipkrt(driver);
		iphonePge = new iphone_price_pge(driver);
		crt = new dd_to_crt(driver);
	}

	@AfterClass
	public void fterClss() {
		System.out.println("fter Clss");
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("before Method");

	}

	@AfterMethod
	public void fterMethod() throws InterruptedException {
		System.out.println("fter Method");
		Thread.sleep(3000);

	}

}
