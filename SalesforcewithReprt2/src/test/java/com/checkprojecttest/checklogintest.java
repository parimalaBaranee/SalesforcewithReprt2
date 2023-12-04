package com.checkprojecttest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.checkproject.Base.BaseTest;
import com.checkprojectPage.checkloginpage;

public class checklogintest extends BaseTest{
	WebDriver driver;
	checkloginpage loginpage;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver = getDriver();
		launchapp(driver);
		 loginpage = new checkloginpage(driver);  // Passing the driver to find element
		
	}
	
	@Test(priority = 1)
	public void loginErrormessage()
	{
		//To check the error msg display if we didn't given password
		
		System.out.println("********Tc01Login username and click login **start******");	
		loginpage.enterintoUsername("parimala@google.com");
		loginpage.clicklogin();
		System.out.println("Display error message");
		System.out.println("*************TC01 Display Error message*****End*************");
		
	}
	@Test(priority = 2)
	public void login() {
		//To check username and password and login successfully
		System.out.println("********Tc02Login vaid username and password **start******");
		loginpage.enterintoUsername("parimala@google.com");
		System.out.println("Successfully Entered Username");
		loginpage.enterintoPassword("Test1234");
		loginpage.clicklogin();
		System.out.println("Successfully Logged");
	System.out.println("*************TC02 Login *****End*************");
	}
	@Test(priority = 3)
	
	public void checkremberme()
	{
		
		//To check valid username and password with Remember me
		System.out.println("********Tc03Login vaid username and password with Remember me**start******");
				loginpage.enterintoUsername("parimala@google.com");
				loginpage.enterintoPassword("Test1234");
				loginpage.Remembermelogin();
				loginpage.clicklogin();
				loginpage.menudropdownbox();
				loginpage.clicklogout();
				System.out.println("Login successfully with remember me");
				//validate the errormessage
				System.out.println("******TC03Login Invalid username and password with Remember me*** end **********");
	}
	@Test(priority = 4)
	
	public void forgetpasswordwithrememberme()
	{
		
		//To check valid username and password with Remember me
		System.out.println("********Tc4aLogin forget  password and continue login**start******");
				loginpage.enterintoUsername("parimala@google.com");
				loginpage.enterintoPassword("Test1234");
				loginpage.clickforgetPasswordlink();
				loginpage.userlogintextbox("parimala@google.com");
				loginpage.clickcontinuelogin();
				System.out.println("Login successfully with forget password link");
				//validate the errormessage
				System.out.println("******TC4aLogin forget password and continue login*** end **********");
	}
	@Test(priority = 5)	
	public void logininvalidUserandPassword() {
		//To check invalid username and password
		System.out.println("********Tc4bLogin Invaid username and password checking*** start********");
		loginpage.enterintoUsername("1234@google.com");
		loginpage.enterintoPassword("1234");
		loginpage.clicklogin();
		System.out.println("Login Failed");
		//validate the errormessage
		System.out.println("******TC4bLogin Invalid username and password*** end **********");
	}
	
	@AfterMethod
	public void teardown() {
		
		close();}

}
