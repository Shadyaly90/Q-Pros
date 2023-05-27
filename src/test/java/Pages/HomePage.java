package Pages;



import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.PageBase;


public class HomePage extends PageBase{

	WebDriver driver;
	WebDriverWait wait ;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

//Locators
	
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[1]/strong")									
		WebElement litePackageName;
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/strong")
		WebElement basicPackageName;
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/div/div[3]/strong")
		WebElement premiumPackageName;
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/b")
		WebElement litePackagePrice;
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/b")
		WebElement basicPackagePrice;	
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[3]/div/b")
		WebElement premiumPackagePrice;	
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/i")
		WebElement litePackageCurrency;	
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[2]/div/i")
		WebElement basicPackageCurrency;	
		@FindBy(how = How.XPATH, using ="/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div[2]/div[3]/div/i")
		WebElement premiumPackageCurrency;	
//Methods
		
		public boolean litePackageNameAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackageName.getText();
			assertEquals(packageName, "لايت");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean basicPackageNameAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackageName.getText();
			assertEquals(packageName, "الأساسية");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean premiumPackageNameAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackageName.getText();
			assertEquals(packageName, "بريميوم");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean saudiLitePackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackagePrice.getText();
			assertEquals(packageName, "15");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean saudiBasicPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackagePrice.getText();
			assertEquals(packageName, "25");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean saudiPremiumPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackagePrice.getText();
			assertEquals(packageName, "60");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean saudiLitePackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackageCurrency.getText();
			assertEquals(packageName, "ريال سعودي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean saudiBasicPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackageCurrency.getText();
			assertEquals(packageName, "ريال سعودي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean saudiPremiumPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackageCurrency.getText();
			assertEquals(packageName, "ريال سعودي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		

		public boolean kuwaitLitePackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackagePrice.getText();
			assertEquals(packageName, "1.2");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean kuwaitBasicPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackagePrice.getText();
			assertEquals(packageName, "2.5");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean kuwaitPremiumPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackagePrice.getText();
			assertEquals(packageName, "4.8");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean kuwaitLitePackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackageCurrency.getText();
			assertEquals(packageName, "دينار كويتي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean kuwaitBasicPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackageCurrency.getText();
			assertEquals(packageName, "دينار كويتي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean kuwaitPremiumPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackageCurrency.getText();
			assertEquals(packageName, "دينار كويتي/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean bahrainLitePackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackagePrice.getText();
			assertEquals(packageName, "2");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean bahrainBasicPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackagePrice.getText();
			assertEquals(packageName, "3");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean bahrainPremiumPackagePriceAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackagePrice.getText();
			assertEquals(packageName, "6");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean bahrainLitePackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= litePackageCurrency.getText();
			assertEquals(packageName, "‫دينار بحريني/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

		public boolean bahrainBasicPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= basicPackageCurrency.getText();
			assertEquals(packageName, "‫دينار بحريني/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}
		
		public boolean bahrainPremiumPackageCurrencyAssertion(WebDriver driver) throws InterruptedException{
			boolean exist=false;
		try{
			String packageName= premiumPackageCurrency.getText();
			assertEquals(packageName, "‫دينار بحريني/شهر");
		exist=true;
		}catch (Exception e) {
			exist=false;
		}
			return exist;	
			
		}

}
