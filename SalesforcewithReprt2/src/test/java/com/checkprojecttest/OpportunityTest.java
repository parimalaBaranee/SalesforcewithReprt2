package com.checkprojecttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.AccountPage;
import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.OpportunityPage;
import com.checkprojectPage.checkloginpage;




public class OpportunityTest extends BaseTest {
	WebDriver driver;
	checkloginpage loginpage;
	
	MySettingPage settingtest;
	AccountPage createAccount;
	OpportunityPage opportunity;
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage(driver);  // Passing the driver to find element
		 settingtest=new MySettingPage(driver);
		 createAccount=new AccountPage(driver);
		 opportunity=new OpportunityPage(driver);
	//	 DOMConfigurator.configure("log4j.xml");
	
	}
@Test(priority = 16)

	public void Tc15createOpportunity()
	{
	loginpage.enterintoUsername("parimala@google.com");
	  loginpage.enterintoPassword("Test1234");
	  loginpage.clicklogin();
	  createAccount.clickAllTab();
	  opportunity.Opportunitylink();
	  
	  
	  
	  List<String> userOpportunities = Arrays.asList ("All Opportunities", "Closing Next Month", "Closing This Month",
              "My Opportunities","New Last Week", "New This Week","Opportunity Pipeline", "Private","Recently Viewed Opportunities", "Won");
	 boolean isTextInList = opportunity.isElementTextInList(userOpportunities);
System.out.println(isTextInList+"The expected Result match with actual result");
      // Assert the result
     // Assert.assertTrue(opportunity.isElementTextInList(userOpportunities), "WebElement text does not match any string in the list.");
	}
    
     
	
	@Test (priority = 17)
public void Tc16NewOpportunity()
{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		  opportunity.Opportunitylink();
		  opportunity.OpportunityLink1();
		  opportunity.TeamLeader("TeamLead");
		  opportunity.DataAnalyst("Data Analystic");
		  opportunity.Teamdate();
		  opportunity.needanalysis(4);
		
opportunity.Duration("Needs Analysis");
opportunity.Teamsendkeys("");
opportunity.SaveCreateOpportunity();
driver.switchTo().activeElement();
}
	@Test(priority = 18)
	public void Tc17OpportunityPipeline()
	{
			loginpage.enterintoUsername("parimala@google.com");
			  loginpage.enterintoPassword("Test1234");
			  loginpage.clicklogin();
			  createAccount.clickAllTab();
			  opportunity.Opportunitylink();
			  opportunity.selectOpportunityDropdownOption("Opportunity Pipeline");
 Assert.assertTrue(opportunity.isOpportunitiesDropdownPresent(), "Opportunities dropdown is not present.");		
 opportunity.checkOpportunitypipeline();
	}
	@Test(priority = 19)
	public void Tc18StuckOpportunitylink()
	{
			loginpage.enterintoUsername("parimala@google.com");
			  loginpage.enterintoPassword("Test1234");
			  loginpage.clicklogin();
			  createAccount.clickAllTab();
			  opportunity.Opportunitylink();
			  opportunity.Opportunitystucktop();
	}
	@Test(priority = 20)
	
	public void Tc19TestQuarterlySummerReport()
	{
			loginpage.enterintoUsername("parimala@google.com");
			  loginpage.enterintoPassword("Test1234");
			  loginpage.clicklogin();
			  createAccount.clickAllTab();
			  opportunity.Opportunitylink();
			 opportunity.selectQuaterlyview("Current FQ");
			 opportunity.selectallopportunity("All Opportunities");
			 opportunity.clickOpportunitylink();
	}
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();

}
}
