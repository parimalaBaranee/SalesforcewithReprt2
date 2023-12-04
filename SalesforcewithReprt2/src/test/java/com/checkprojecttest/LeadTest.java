package com.checkprojecttest;

import java.util.Arrays;
import java.util.List;

//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.AccountPage;
import com.checkprojectPage.LeadPage;
import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.checkloginpage;


public class LeadTest extends BaseTest {
	WebDriver driver;
	checkloginpage loginpage;
	
	MySettingPage settingtest;
	AccountPage createAccount;
	LeadPage lead;
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage(driver);  // Passing the driver to find element		
		 settingtest=new MySettingPage(driver);
		 createAccount=new AccountPage(driver);
		 lead=new LeadPage(driver);
		// DOMConfigurator.configure("log4j.xml");
	
	}
	@Test(priority = 21)
	public void TC20clickLeadTab()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.clickLeadTab();
	}			
	@Test(priority = 22)
	
	public void TC21LeadSelectView()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.clickLeadTab();
			lead.clicViewTabList();
			lead.getElementText();
 List<String> userOpportunities = Arrays.asList ("All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads","View - Custom 1","View - Custom 2");
			 boolean isTextInList = lead.isElementTextInList(userOpportunities);
		System.out.println(isTextInList+"The expected Result match with actual result");

	}
	@Test(priority = 23)
	public void TC22CheckNewButton()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.clickLeadTab();
		lead.selectunreadoption("My Unread Leads");
		 lead.Menudropdownid();
		 lead.leadlogout();
		
		 loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.LeadTab2();
		  lead.LeadTab3();
			}
	@Test(priority = 24)
	
	public void TC23TodayLead()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.clickLeadTab();
		lead.SelectLeadTab("Today's Leads");
			}
	@Test(priority = 25)
	public void TC24CheckNewButton()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  lead.clickLeadTab();
		  lead.clickNewButton();
		  lead.FirstLeadName("AbrahamLincon");
		  lead.LastLeadName("brothers");
		  lead.SelectLeadName("Blooming");
		  lead.Selectlead5("Web");
		  lead.SelectLead6("Working - Contacted");
		  lead.clickLead7();
			}
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();

}
}

