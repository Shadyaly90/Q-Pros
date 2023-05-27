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



public class KuwaitTestScenarios extends Browserinit{

	public String kuwaitURL = "https://subscribe.stctv.com/kw-ar"; //URL
	WebDriver kuwaitDriver;
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
		extent = new ExtentReports("KuwaitExtentReport.html", true); // report	
		kuwaitDriver = Browserinit.startbrowser( kuwaitURL ,"chrome"); 
		screenshot= new GetScreenShot();
		homepage = new HomePage (kuwaitDriver);
		pagebase= new PageBase(kuwaitDriver);
	}

	@AfterSuite
	public void tearDownSuite() {
		extent.endTest(test);
		extent.flush();
		//extent.close();
		kuwaitDriver.close();
		kuwaitDriver.quit();
	}

	@Test(priority = 1 )
	public void KuwaitCheckPackageNameScenario() throws Exception {
		test = extent.startTest("Kuwait Check Package Name scenario");
		test.log(LogStatus.INFO, "Package Name Scenario Started");
		assertTrue(homepage.litePackageNameAssertion(kuwaitDriver));
		assertTrue(homepage.basicPackageNameAssertion(kuwaitDriver));
		assertTrue(homepage.premiumPackageNameAssertion(kuwaitDriver));
		screenshot.capture(kuwaitDriver,"Kuwait Package Name Verification");
		test.log(LogStatus.INFO, "Scenario finished");		
	}

	@Test(priority = 1 )
	public void KuwaitCheckPackagePriceScenario() throws Exception {
		test = extent.startTest("Kuwait Check Package Price scenario");
		test.log(LogStatus.INFO, "Package Price Scenario Started");
		assertTrue(homepage.kuwaitLitePackagePriceAssertion(kuwaitDriver));
		assertTrue(homepage.kuwaitBasicPackagePriceAssertion(kuwaitDriver));
		assertTrue(homepage.kuwaitPremiumPackagePriceAssertion(kuwaitDriver));		
		screenshot.capture(kuwaitDriver,"Kuwait Package Price Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}

	@Test(priority = 1 )
	public void KuwaitCheckPackageCurrencyScenario() throws Exception {
		test = extent.startTest("Kuwait Check Package Currency scenario");
		test.log(LogStatus.INFO, "Package Currency Scenario Started");
		assertTrue(homepage.kuwaitLitePackageCurrencyAssertion(kuwaitDriver));
		assertTrue(homepage.kuwaitBasicPackageCurrencyAssertion(kuwaitDriver));
		assertTrue(homepage.kuwaitPremiumPackageCurrencyAssertion(kuwaitDriver));		
		screenshot.capture(kuwaitDriver,"Kuwait Package Currency Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}
	
}

