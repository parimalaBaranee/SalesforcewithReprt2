package com.checkprojecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.AccountPage;
import com.checkprojectPage.ContactPage;
import com.checkprojectPage.LeadPage;
import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.VerificationPage;
import com.checkprojectPage.checkloginpage;



public class VerificationTest extends BaseTest {
	
	WebDriver driver;
	checkloginpage loginpage;
	
	MySettingPage settingtest;
	AccountPage createAccount;
	LeadPage lead;
	VerificationPage verify;
	ContactPage contact;
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage(driver);  // Passing the driver to find element
		
		 settingtest=new MySettingPage(driver);
		 createAccount=new AccountPage(driver);
		 lead=new LeadPage(driver);
		 contact=new ContactPage(driver);
       verify=new VerificationPage(driver);
}
	
	
	@Test(priority = 34)
	public void TC33VerifyFirstandlastname() {
	loginpage.enterintoUsername("parimala@google.com");
	  loginpage.enterintoPassword("Test1234");
	  loginpage.clicklogin();
	  verify.clickhome();
	  String homeactualFullName=verify.homename();
	  verify.myprofilelink();
	  String myfrofileactualFullName=verify.myprofilename();
	
      // Verify that the displayed page is the My Profile page and the user's full name is correct
      Assert.assertEquals(homeactualFullName,  myfrofileactualFullName, "User's full name is incorrect");
	}
	@Test(priority = 35)
	public void TC34VerifyEditFirstandLast()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  verify.clickhome();
		  verify.FirstandLastnamelink();
		  String initialName = driver.findElement(By.id("tailBreadcrumbNode")).getText().trim();
		  String updatedmenudropdownlastname=driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText().trim();
		  verify.EditProfile();
		  String mainwindow=driver.getWindowHandle();
		 	driver.switchTo().frame("contactInfoContentId");
		 	verify.AboutTab();
		 	verify.lastname("Lucky");
		 	verify.SaveAll();
			driver.switchTo().window(mainwindow);
		
	 String s2=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']")).getText().trim();
			//     String s1="Parimala Lucky";
			     
			     	if (initialName.equals(s2)) 
			     	    	  System.out.println("user fullname is correct displayed in homepage");
			     	      else
			     	    	  System.out.println("user fullname is incorrect displayed in homepage");
			     		
String updatedmenudropdownlastname1= driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText().trim();
			     	    	 
			     if (updatedmenudropdownlastname.equals( updatedmenudropdownlastname1)) 
			         	    	  System.out.println("user fullname is correct in menudropdownlist");
			         	      else
			     	  System.out.println("user fullname is incorrect in menudropdownlist");	  
			     
			     
	}
	@Test(priority = 36)
	public void TC35Verifytabcustomization() {
	loginpage.enterintoUsername("parimala@google.com");
	  loginpage.enterintoPassword("Test1234");
	  loginpage.clicklogin();
	  verify.clickplusSymbol();
	  verify.clickcustomizetab();
	  verify.clickselectoption("Subscriptions");
	  verify.RemoveSelectOption();
	  verify.clicksavecustomizetab();
	  lead.Menudropdownid();
	  loginpage.clicklogout();
	  loginpage.enterintoUsername("parimala@google.com");
	  loginpage.enterintoPassword("Test1234");
	  loginpage.clicklogin();
	}
	@Test(priority = 37)
	public void Tc36BlockingViewIntheCalendar()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  verify.clickhome();
		  verify.clickcurrentdatelink();
		  verify.clickselecttimelink(); 
		  System.out.println(driver.getTitle());
		String ActualText=driver.getTitle();
			String ExpectedText="Calendar: New Event ~ Salesforce - Developer Edition";
			if(ActualText.equals(ExpectedText))
			{
				System.out.println("The window title is"+driver.getTitle());
			}
			else
			System.out.println("The window title is not same");
			verify.clickselectsubject();
			
			java.util.Set<String> windowHandles = driver.getWindowHandles();
			 java.util.Iterator<String> itr= windowHandles.iterator();
			 String ParentWindow=itr.next();
			 String ChildWindow=itr.next();
			 driver.switchTo().window(ChildWindow);
			 verify.clickselectoption();
			 driver.switchTo().window(ParentWindow);
			 verify.clickEndtime();
			 verify.clicktimepicker();
			 verify.SaveCalendarEvent();
	}
	@Test(priority = 38)
	
	public void TC37BlockingCalendarWeeklyRecurrence()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  verify.clickhome();
		  verify.clickcurrentdatelink();
		  verify.clickselecttimelink(); 
		  System.out.println(driver.getTitle());
		String ActualText=driver.getTitle();
			String ExpectedText="Calendar: New Event ~ Salesforce - Developer Edition";
			if(ActualText.equals(ExpectedText))
			{
				System.out.println("The window title is"+driver.getTitle());
			}
			else
			System.out.println("The window title is not same");
			verify.clickselectsubject();
			
			java.util.Set<String> windowHandles = driver.getWindowHandles();
			 java.util.Iterator<String> itr= windowHandles.iterator();
			 String ParentWindow=itr.next();
			 String ChildWindow=itr.next();
			 driver.switchTo().window(ChildWindow);
			 verify.clickselectoption();
			 driver.switchTo().window(ParentWindow);
			 verify.clickEndtime();
			 verify.clicktimepicker1();
			 verify.checkisrecurrence();
			 verify.selectweeklyfrequency();
			 verify.calculateDate();
			 verify.calculateDate1();
			 verify.SaveWeeklyrecurrence();
			 verify.MonthView();
	}
	/*@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();

}*/

}