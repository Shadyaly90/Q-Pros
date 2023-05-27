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



public class BahrainTestScenarios extends Browserinit{

	public String bahrainURL = "https://subscribe.stctv.com/bh-ar"; //URL
	WebDriver bahrainDriver;
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
		extent = new ExtentReports("BahrainExtentReport.html", true); // report	
		bahrainDriver = Browserinit.startbrowser( bahrainURL ,"chrome"); 
		screenshot= new GetScreenShot();
		homepage = new HomePage (bahrainDriver);
		pagebase= new PageBase(bahrainDriver);
	}

	@AfterSuite
	public void tearDownSuite() {
		extent.endTest(test);
		extent.flush();
		//extent.close();
		bahrainDriver.close();
		bahrainDriver.quit();
	}

	@Test(priority = 1 )
	public void BahrainCheckPackageNameScenario() throws Exception {
		test = extent.startTest("Bahrain Check Package Name scenario");
		test.log(LogStatus.INFO, "Package Name Scenario Started");
		assertTrue(homepage.litePackageNameAssertion(bahrainDriver));
		assertTrue(homepage.basicPackageNameAssertion(bahrainDriver));
		assertTrue(homepage.premiumPackageNameAssertion(bahrainDriver));
		screenshot.capture(bahrainDriver,"Bahrain Package Name Verification");
		test.log(LogStatus.INFO, "Scenario finished");		
	}

	@Test(priority = 1 )
	public void BahrainCheckPackagePriceScenario() throws Exception {
		test = extent.startTest("Bahrain Check Package Price scenario");
		test.log(LogStatus.INFO, "Package Price Scenario Started");
		assertTrue(homepage.bahrainLitePackagePriceAssertion(bahrainDriver));
		assertTrue(homepage.bahrainBasicPackagePriceAssertion(bahrainDriver));
		assertTrue(homepage.bahrainPremiumPackagePriceAssertion(bahrainDriver));		
		screenshot.capture(bahrainDriver,"Bahrain Package Price Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}

	@Test(priority = 1 )
	public void BahrainCheckPackageCurrencyScenario() throws Exception {
		test = extent.startTest("Bahrain Check Package Currency scenario");
		test.log(LogStatus.INFO, "Package Currency Scenario Started");
		assertTrue(homepage.bahrainLitePackageCurrencyAssertion(bahrainDriver));
		assertTrue(homepage.bahrainBasicPackageCurrencyAssertion(bahrainDriver));
		assertTrue(homepage.bahrainPremiumPackageCurrencyAssertion(bahrainDriver));		
		screenshot.capture(bahrainDriver,"Bahrain Package Currency Verification");
		test.log(LogStatus.INFO, "Scenario finished");
		
	}
	
}

