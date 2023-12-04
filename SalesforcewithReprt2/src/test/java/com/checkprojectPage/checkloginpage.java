package com.checkprojectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.checkproject.Base.BasePage;

public class checkloginpage extends BasePage{
	
	
	public checkloginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="username")WebElement Username;	
	@FindBy(id="password")WebElement password;
	@FindBy(id="Login") WebElement login;
	public void enterintoUsername(String strusername) {
		 waitforElement(Username,20);
		Username.sendKeys(strusername);
	}
	
	public void enterintoPassword(String strpassword) {
		 waitforElement(Username,20);
		password.sendKeys(strpassword);
	}
	
	public void clicklogin() {
		login.click();
	}
	@FindBy(id="forgot_password_link") WebElement forgetpassword;
	@FindBy(id="un") WebElement userloginname;
	@FindBy(id="continue") WebElement continuelogin;
	@FindBy(id="rememberUn") WebElement rememberme;
	@FindBy(id="userNavLabel")WebElement menudropdown;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")WebElement logout;
	
	
	public void Remembermelogin() {
		rememberme.click();
	}
	
	public void clickforgetPasswordlink() {
		forgetpassword.click();
	}
	public void userlogintextbox(String struserloginname) {
		userloginname.sendKeys(struserloginname);
		
	}
	public void clickcontinuelogin() {
		continuelogin.click();
	}
	public void menudropdownbox() {
		menudropdown.click();
	}
	
	public void clicklogout() {
		logout.click();
	}
	
}

