package com.checkprojecttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;

import com.checkprojectPage.MySettingPage;
import com.checkprojectPage.checkloginpage;

public class MYSettingTest extends BaseTest {
	WebDriver driver;
	checkloginpage loginpage;

	
	MySettingPage settingtest;
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage(driver);  // Passing the driver to find element
	   
		
		 settingtest=new MySettingPage(driver);
		// DOMConfigurator.configure("log4j.xml");
		
	}
	@Test(priority = 6)	
	
public void TC05SampleDropdownlisttest()
	
	
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		 loginpage.menudropdownbox();
		 String actualusername=driver.findElement(By.id("userNavLabel")).getText().trim();
		
			String expectedusername="Parimala Lucky";
			if(actualusername.equals(expectedusername))
			
				System.out.println("user account name is valid");
				else
				System.out.println("user account name is not valid");
			// Assert.assertEquals(actualusername,
	                   // "actual username is valid:" + expectedusername + " expectedusername.");	
			
		        List<String> expectedDropdownItems = Arrays.asList(
		                "My Profile",
		                "My Settings",
		                "Developer Console",
		                "Switch to Lightning Experience" ,"Logout"
		        );

		        // Get the actual list of items from the dropdown
  List<WebElement> actualDropdownItems = driver.findElements(By.xpath("//div[@id='userNav-menuItems']//a"));

		        // Verify that the actual items match the expected items
	    Assert.assertEquals(actualDropdownItems.size(), expectedDropdownItems.size(),
		                "Number of items in the dropdown is incorrect.");

	   for (int i = 0; i < expectedDropdownItems.size(); i++) {
		     Assert.assertEquals(actualDropdownItems.get(i).getText(), expectedDropdownItems.get(i),
		                    "Item at index " + i + " does not match the expected value.");
		        }

		

	}
	
	@Test(priority = 7)	
	public void Tc06new()
	{
				loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		     loginpage.clicklogin();
		     loginpage.menudropdownbox();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		settingtest.clickmyprofile();
	       settingtest.clickEditprofile();
		String mainwindow=driver.getWindowHandle();
		driver.switchTo().frame("contactInfoContentId");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		settingtest.AboutTestactivity1();
		settingtest.AboutTestactivitylastactivity("Lucky");
		 settingtest.SaveAll();
		System.out.println("Last Name Saved successfully");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		
		//Photo Upload
		
		settingtest.actionmoveelement();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("uploadPhotoContentId");

		settingtest.uploadphotosprofile("C:\\Sample\\girl1.jpeg");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		settingtest.Savephoto();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		settingtest.Savephoto1();
		
		System.out.println("Photo uploaded successfully");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		//FileUpload
		settingtest.FileLinkClick();
		   settingtest.ChooseFileClick();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		settingtest.Fileupload("C:\\Sample\\sample data to upload.txt");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		
		settingtest.publishersharebutton();
		
		System.out.println("File uploaded successfully");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//post message
		settingtest.postlink();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mainwindow1=driver.getWindowHandle();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));		
	settingtest.postmsgText1("Happy to be part of Automation");	
	//driver.switchTo().window(mainwindow);
		driver.switchTo().defaultContent();
	System.out.println("testsuccess");
	settingtest.publishersharepost();
	System.out.println("Post link is clicked and share the text");
	driver.switchTo().activeElement();

		
	}
	

	@Test(priority = 8)	
	public void Tc07EmailDeveloper()
	{
		 loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		 loginpage.menudropdownbox();
		  settingtest.clickmysettings();
		  settingtest.Personalfont();
		  settingtest.Loginhistoryfonttype();
		  settingtest.pageshowmore();
		  settingtest.displaylayoutandfonttype();
		  settingtest.showcustomizetab();
		  settingtest.salesforcechatter();
		  settingtest.selectarrow();
		  settingtest.savebutton();
		  settingtest.Emailfont();
		  settingtest.Emailsettingfontt();
		  settingtest.Sentname("Test1234");
		  settingtest.senderEmail("Parimalabaraneetharan@gmail.com");
		  settingtest.Autoclick();
		  String originalHandle = driver.getWindowHandle();  
		 settingtest.elementsubmit();
		settingtest.calendarremaindar();
		 settingtest.remainderfont();;
		 settingtest.Testactivity1();
		  driver.switchTo().window(originalHandle);  
	}
	@Test(priority = 9)	
	public void Tc08selectDeveloperConsole()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		 loginpage.menudropdownbox();
		
		 String originalHandle = driver.getWindowHandle();
		  settingtest.selectdeveloperconsole();
		  for (String windowHandle : driver.getWindowHandles()) {
	            if (!windowHandle.equals(originalHandle)) {
	                driver.switchTo().window(windowHandle);
	                // Perform actions on the new window if needed

	                // Close the new window
	                driver.close();
	                break;
	            }
	        }
	
	        // Switch back to the original window
	        driver.switchTo().window(originalHandle);
	        // Perform further actions on the original window if needed
	    }
	@Test(priority = 10)	
	public void Tc09Logout()
	{
		loginpage.enterintoUsername("parimala@google.com");
		  loginpage.enterintoPassword("Test1234");
		  loginpage.clicklogin();
		loginpage.menudropdownbox();
		  loginpage.clicklogout();
	    }
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
		
	}
	
	
	
}


