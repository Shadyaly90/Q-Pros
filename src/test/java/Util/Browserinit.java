package Util;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Browserinit {
	static WebDriver driver;

	public static WebDriver startbrowser(String url , String browsername) {

		
		
	if(browsername.toLowerCase().contains("chr")){
		ChromeOptions options = new ChromeOptions();
		        options.addArguments("start-maximized");
		        options.setExperimentalOption("useAutomationExtension", false);
		        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			
			//options.setCapability("resolution", "1024x768"); // special request fl task 
			driver = new ChromeDriver(options);
	}else if (browsername.toLowerCase().contains("fire")) {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("start-maximized");
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		//options.setCapability("resolution", "1024x768");
		 driver = new FirefoxDriver(options);		
		
	}
	
	
	
		driver.navigate().to(url);
		driver.manage().window().maximize();

		return driver;

	}

}
