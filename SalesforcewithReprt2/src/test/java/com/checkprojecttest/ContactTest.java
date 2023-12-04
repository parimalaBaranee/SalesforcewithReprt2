package com.checkprojecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.AccountPage;
import com.checkprojectPage.ContactPage;
import com.checkprojectPage.LeadPage;
import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.checkloginpage;



public class ContactTest extends BaseTest {
	WebDriver driver;
checkloginpage loginpage;
	
	MySettingPage settingtest;
	AccountPage createAccount;
	LeadPage lead;
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
		// DOMConfigurator.configure("log4j.xml");
	
	}
	@Test(priority = 26)
	public void TC25createNewContact()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		 contact.ClickNewButton();
		 contact.SendName1("Rajpet");
		 contact.sendName2("Parimala Baranee1");
		 contact.clicknewlink();
	
				
			}
	@Test(priority = 27)
	public void TC26createNewContact()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		 contact.ContactPathLink();
		 contact.ContactFirstName("Maribel");
		contact.DevName();
		 contact.SaveCreateNewContact();
		
			}
	@Test(priority = 28)
	public void TC27CheckRecentlyCreated()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		contact.ContactRecentlyCreated("Recently Created");
		
			}
	@Test(priority = 29)
	public void TC28CheckMyContactView()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		contact.CheckMyContact("My Contacts");
		
			}
	@Test(priority = 30)
	public void TC29ViewContact()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		// driver.switchTo().defaultContent();
		// String mainwindow1=driver.getWindowHandle();
		// WebElement pathframe= driver.findElement(By.xpath("//iframe[@title='sessionserver']"));
		  //  settingtest.driver.switchTo().frame(0);
		   
		contact.SaveCreateNew();
			}
	
	@Test(priority = 31)
	public void TC30CheckErrormessage()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		contact.ErrorContactTab1();
		contact.ErrorContactsendkey("ABCD");
		contact.ErrorContactsendDevName("");
		contact.clicktocheckerrorcontactmsg();
			}
	@Test(priority = 32)
	public void TC31Checkcancelbuttonincontact()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		contact.ErrorContactTab1();
		contact.ErrorContactsendkey("PQRS");
		contact.ErrorContactsendDevName("UVMN");
		contact.ClicktoCheckCancelButton();
			}
	@Test(priority = 33)
	public void TC32SaveandNewInContact()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		  createAccount.clickAllTab();
		 contact.contactTab();
		contact.SaveandNewContacttab();
		contact.SaveandNewContacttab1("Indian");
		contact.SaveandNewContacttab2("");
		contact.SubmitNewContacttab();
			}
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
		
	}

}
