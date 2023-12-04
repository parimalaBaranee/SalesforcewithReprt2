package com.checkprojecttest;

//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.AccountPage;
import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.checkloginpage;




public class AccountTest extends BaseTest {
	WebDriver driver;
	checkloginpage loginpage;
	
	MySettingPage settingtest;
	AccountPage createAccount;
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage (driver);  // Passing the driver to find element

		 settingtest=new MySettingPage(driver);
		 createAccount=new AccountPage(driver);
		 
	
	}
	@Test(priority = 11)
	public void TC10createAccount()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  createAccount.clickAccountLink();
		  createAccount.clicknewlink();
		  createAccount.sendfirstname("Dolly");
		  createAccount.Sentuniquename("Dolly");	  
		  createAccount.savecreateaccountbutton();
				
			}
		
	@Test(priority = 12)
	public void TC11createAccount()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  createAccount.clickAccountLink();
		  createAccount.AccountNewLink();
		  createAccount.AccountName("Blooming"); 
		  createAccount.selectOptionByAccountType("Technology Partner");
		  createAccount.AccountPriority("High");
		 
		  createAccount.saveNewAccount();
			
		
				
			}
	
		
		 
		@Test(priority = 13)
		public void Tc12AccountEditView()
		{
			loginpage.enterintoUsername("parimala@google.com");
			  loginpage.enterintoPassword("Test1234");
			  loginpage.clicklogin();
			  createAccount.clickAllTab();
			  createAccount.clickAccountLink();
			  createAccount.selectdropdown(6);
			   createAccount.AccountEditLink();
			  createAccount.accountfirstname("kavin");
			  createAccount.selectAccountName("Account Name");
			  createAccount.selectoprator("contains");
			  createAccount.accountfindvalue("a");
			  createAccount.saveEditAccount();
		} 
		
		
			
	@Test(priority = 14)
	public void TC13MergeAccount()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  createAccount.clickAccountLink();
		  createAccount.clickmergeaccount();
		   createAccount.MergeFindvalue("Blooming");
		  createAccount.findaccountclk();
		  createAccount.findaccountselected();
		  createAccount.findaccountclknext();
		  createAccount.clickmergeall(); 
		 driver.switchTo().alert().accept();
		 //capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		  }
		
	@Test(priority = 15)
	
	public void Tc14createAccountReport()
	
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  createAccount.clickAccountLink();
		  createAccount.clickacctlastactivity();
		  createAccount.aactTodate();;
		  createAccount.aactTodate1();
		  createAccount.aactfromdate();
		  createAccount.accfromdate1();
		  createAccount.saveunreport();
		  String originalHandle = driver.getWindowHandle();
		  createAccount.ReprtName("sales");
		  createAccount.UniqueReportName("");
		  createAccount.saveGenerateReport();
		  driver.switchTo().window(originalHandle);
		  
	}
			
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
		
	}

}
