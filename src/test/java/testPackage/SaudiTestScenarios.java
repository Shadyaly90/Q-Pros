package testPackage;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Util.Browserinit;
import Util.GetScreenShot;
import Util.PageBase;
import Pages.HomePage;



public class SaudiTestScenarios extends Browserinit{

	public String SaudiURL = "https://subscribe.stctv.com/sa-ar"; //URL
	WebDriver saudiDriver;
	PageBase pagebase;
	GetScreenShot screenshot;
	String alertMsg;
	String successMsg;
	Alert alert;
	String custId;
	String msgId;
	HomePage homepage;
	public static ExtentTest test;
	public static ExtentReports extent;


	@BeforeClass
	public void init() {
		extent = new ExtentReports("SaudiExtentReport.html", true); // report	
		saudiDriver = Browserinit.startbrowser( SaudiURL ,"chrome"); 
		screenshot= new GetScreenShot();
		homepage = new HomePage (saudiDriver);
		pagebase= new PageBase(saudiDriver);
	}

	@AfterSuite
	public void tearDownSuite() {
		extent.endTest(test);
		extent.flush();
		//extent.close();
		saudiDriver.close();
		saudiDriver.quit();
	}

	@Test(priority = 1 )
	public void SaudiCheckPackageNameScenario() throws Exception {
		test = extent.startTest("Saudi Check Package Name scenario");
		test.log(LogStatus.INFO, "Package Name Scenario Started");
		assertTrue(homepage.litePackageNameAssertion(saudiDriver));
		assertTrue(homepage.basicPackageNameAssertion(saudiDriver));
		assertTrue(homepage.premiumPackageNameAssertion(saudiDriver));
		screenshot.capture(saudiDriver,"Saudi Package Name Verification");
		test.log(LogStatus.INFO, "Scenario finished");		
	}

	@Test(priority = 1 )
	public void SaudiCheckPackagePriceScenario() throws Exception {
		test = extent.startTest("Saudi Check Package Price scenario");
		test.log(LogStatus.INFO, "Package Price Scenario Started");
		assertTrue(homepage.saudiLitePackagePriceAssertion(saudiDriver));
		assertTrue(homepage.saudiBasicPackagePriceAssertion(saudiDriver));
		assertTrue(homepage.saudiPremiumPackagePriceAssertion(saudiDriver));		
		screenshot.capture(saudiDriver,"Saudi Package Price Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}

	@Test(priority = 1 )
	public void SaudiCheckPackageCurrencyScenario() throws Exception {
		test = extent.startTest("Saudi Check Package Currency scenario");
		test.log(LogStatus.INFO, "Package Currency Scenario Started");
		assertTrue(homepage.saudiLitePackageCurrencyAssertion(saudiDriver));
		assertTrue(homepage.saudiBasicPackageCurrencyAssertion(saudiDriver));
		assertTrue(homepage.saudiPremiumPackageCurrencyAssertion(saudiDriver));		
		screenshot.capture(saudiDriver,"Saudi Package Currency Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}
	
}

