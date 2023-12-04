package com.checkprojectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.checkproject.Base.BasePage;



public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Contact_Tab")WebElement contactTab;
	@FindBy(id="name_lastcon2")WebElement sendname;
	@FindBy(xpath="//table/tbody/tr/td[2]/input")WebElement cnewbutton;	
	@FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]")WebElement clickNewlink;
	@FindBy(id="con4")WebElement sendname1;
	
	
	public void contactTab() {
		contactTab.click();
	}
	public void ClickNewButton() {
		cnewbutton.click();
	}
	public void SendName1(String str) {
		sendname.sendKeys(str);;
	}
	public void sendName2(String str) {
		sendname1.sendKeys(str);
	}
	public void clicknewlink() {
		clickNewlink.click();
	}

	@FindBy(xpath="//div/span/span[2]/a[2]")WebElement contactpathlink;
	@FindBy(id="fname")WebElement contactfirstname;
	@FindBy(id="devname")WebElement devname;	
	@FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]")WebElement clickcontacttab;
	public void ContactPathLink() {
		contactpathlink.click();
	}
	public void ContactFirstName(String str) {
		contactfirstname.sendKeys(str);;
	}
	public void DevName() {
		
		devname.click();
		
	}
	public void ClickContactTab() {
		clickcontacttab.sendKeys();
	}
	
	
	@FindBy(id="hotlist_mode")WebElement selectcontacttab;
public void ContactRecentlyCreated(String recentlycreated){
		
	Select  accpriority1  = new Select(selectcontacttab);
		 accpriority1.selectByVisibleText(recentlycreated);
}
	


@FindBy(id="fcf")WebElement checkmycontact;

public void CheckMyContact(String recentlycreated){
	
	Select  checkcontactview  = new Select(checkmycontact);
	 checkcontactview.selectByVisibleText(recentlycreated);
}
	
@FindBy(xpath="/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")WebElement clickcontactview;
@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")WebElement clickcontactviewtab;
public void ContactViewTab1() {
	clickcontactview.click();;
}
public void ContactViewTab2() {
	clickcontactviewtab.click();
}


@FindBy(xpath="//div/span/span[2]/a[2]")WebElement errorcontact1;
@FindBy(id="fname")WebElement errorcontactsendkey;
@FindBy(id="devname")WebElement errorcontactsenddevname;
@FindBy(xpath="//tbody/tr/td[2]/input[1]")WebElement erorcontactclick;


public void ErrorContactTab1() {
	errorcontact1.click();
}
public void ErrorContactsendkey(String str) {
	errorcontactsendkey.sendKeys(str);;
}

public void ErrorContactsendDevName(String str) {
	errorcontactsenddevname.sendKeys(str);;
}
public void clicktocheckerrorcontactmsg() {
	erorcontactclick.click();
}

@FindBy(xpath="//tbody/tr/td[2]/input[2]")WebElement checkcancelbutton;


public void ClicktoCheckCancelButton() {
	checkcancelbutton.click();
}

@FindBy(xpath="//table/tbody/tr/td[2]/input")WebElement saveandnewcontacttab;

@FindBy(id="name_lastcon2")WebElement newcontact1;

@FindBy(id="con4")WebElement newcontact2;

@FindBy(xpath="//td[@id='bottomButtonRow']/input[2]")WebElement submitnewcontact2;



public void SaveandNewContacttab() {
	
		saveandnewcontacttab.click();

}
public void SaveandNewContacttab1(String str) {
	
	newcontact1.sendKeys(str);;

}
public void SaveandNewContacttab2(String str) {
	
	newcontact2.sendKeys(str);;

}
public void SubmitNewContacttab() {
	
	submitnewcontact2.click();

}

@FindBy(xpath="//tr[@class='dataRow even first']/th/a")WebElement clicknamefieldinrecentcontactframe;

public void clicknamefield() {
	waitforElement(clicknamefieldinrecentcontactframe,10);
	
	clicknamefieldinrecentcontactframe.click();

}

@FindBy(xpath="//input[@class='btn primary']")WebElement savecreatenewcontact26;

public void SaveCreateNewContact() {
	
	savecreatenewcontact26.click();

}

@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")WebElement savecreatenew;


public void SaveCreateNew() {
	
	savecreatenew.click();

}







}
