package com.checkprojectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.checkproject.Base.BasePage;



public class AccountPage extends BasePage {
	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="AllTab_Tab")WebElement AllTab;
	@FindBy(xpath = "//a[text()='Accounts']")WebElement Accountlink;	
	@FindBy(xpath = "//form[@id=\"filter_element\"]/div/span/span[2]/a[2]")WebElement Newlink;
	@FindBy(id="fname")WebElement firstname;
	@FindBy(id="devname")WebElement uniqname;
	@FindBy(xpath = "//input[@class='btn primary']")WebElement SavecreateAccount;
	
	public void clickAllTab() {
		 waitforElement(AllTab,20);
		AllTab.click();
		
	}
	public void clickAccountLink() {
		Accountlink.click();
		
	}
	public void clicknewlink() {
		Newlink.click();
		
	}
	public void sendfirstname(String sendfname) {
		
		firstname.clear();
		firstname.sendKeys(sendfname);
		
	}	
	public void Sentuniquename(String sendeuniquename) {
		
		uniqname.clear();
		uniqname.sendKeys(sendeuniquename);
		
	}	
	public void savecreateaccountbutton() {
		SavecreateAccount.click();
		
	}
	
	@FindBy(xpath = "//input[@title='New']")WebElement NewAccountlink;	
	@FindBy(id="acc2")WebElement accountName;
	@FindBy(id="acc6")WebElement accounttype;
	@FindBy(id="00NHn00000HYLwE")WebElement accountpriority;
	@FindBy(xpath = "//table/tbody/tr/td[2][@id='bottomButtonRow']/input[1]")WebElement accountnewlysave;
	
	public void AccountNewLink() {
		NewAccountlink.click();
		
	}
	public void AccountName(String accName) {
		accountName.clear();
		accountName.sendKeys(accName);
		
	}
	
	public void selectOptionByAccountType(String acctext) {
	     
	        Select select = new Select(accounttype);
	        select.selectByVisibleText(acctext);
	    }
		
	    
	public void AccountPriority(String accprior) {
		
		Select  accpriority1  = new Select(accountpriority);
		 accpriority1.selectByVisibleText(accprior);
		 waitforElement(accountpriority,5);
		
	}	
	public void saveNewAccount() {
		 accountnewlysave.click();
		
	}
	
	@FindBy(id="fcf")WebElement findaccountName;
	@FindBy(id="fname")WebElement accfirstname;
	@FindBy(id="fcol1")WebElement selectnameaccount;
	@FindBy(id="fop1")WebElement selectoperator;
	@FindBy(id="fval1")WebElement findvalue;
	@FindBy(xpath = "//div[3]/table/tbody/tr/td[2]/input[1]")WebElement saveeditaccount;
	@FindBy(xpath ="//form[@id='filter_element']/div/span/span[2]/a[1]")WebElement edittlink;
	public void AccountEditLink() {
		 edittlink.click();
		
	}
	public void accountfirstname(String accfName) {
		accfirstname.clear();
		accfirstname.sendKeys(accfName);
		
	}
	
	public void accountfindvalue(String sendkey) {
	     
		findvalue.clear();
		findvalue.sendKeys(sendkey);
	    }
		
	    
	public void selectdropdown(int dropdown) {
		
		Select  accpriority1  = new Select(findaccountName);
		 accpriority1.selectByIndex(dropdown);
		 waitforElement(findaccountName,10);
		
	}	
public void selectoprator(String dropdown) {
		
		Select  accpriority1  = new Select(selectoperator);
		 accpriority1.selectByVisibleText(dropdown);
		
		
	}	
public void selectAccountName(String dropdown) {
	
	Select  accpriority1  = new Select(selectnameaccount);
	 accpriority1.selectByVisibleText(dropdown);
	
	
}	
	public void saveEditAccount() {
		 saveeditaccount.click();
		
	}

@FindBy(id="srch")WebElement mergefind;
@FindBy(id="cid0")WebElement clickcheck;
@FindBy(id="cid1")WebElement clickcheck1;
@FindBy(xpath ="//input[@name='goNext']")WebElement findaccclicknext;
@FindBy(xpath = "//a[text()='Merge Accounts']")WebElement mergeacc;
@FindBy(xpath ="//html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/input[2]")WebElement findaccclick;
@FindBy(xpath = "//div[@class='pbBottomButtons']/input[2] ")WebElement mergeall;
public void clickmergeaccount() {
	mergeacc.click();
	
}
public void MergeFindvalue(String sendkey) {
    
	mergefind.clear();
	mergefind.sendKeys(sendkey);
    }
	
public void findaccountclk() {
	findaccclick.click();
	waitforElement(findaccclick,20);
	}
public void findaccountselected() {
if (!clickcheck.isSelected()) {
	clickcheck.click();
}
	if (!clickcheck1.isSelected()) {
		clickcheck1.click();
}
}
public void findaccountclknext() {
	waitforElement(findaccclicknext,20);
	findaccclicknext.click();
	}
public void clickmergeall() {
	mergeall.click();
	}


@FindBy(id="ext-gen154")WebElement Todate;
@FindBy(id="ext-gen276")WebElement Todate1;
@FindBy(id="ext-gen152")WebElement fromdate;
@FindBy(id="ext-gen292")WebElement fromdate1;
@FindBy(id="ext-gen49")WebElement saveunreport;
@FindBy(id="saveReportDlg_reportNameField")WebElement salesreportname;
@FindBy(id="saveReportDlg_DeveloperName")WebElement salesuniquereportname;
@FindBy(id="ext-gen312")WebElement saveandgeneratereport;
@FindBy(xpath = "//a[text()='Accounts with last activity > 30 days']")WebElement acctlastactivity;


public void clickacctlastactivity() {
	acctlastactivity.click();
	}
public void aactTodate() {
	waitforElement(Todate,5);
	Todate.click();
	
	}
public void aactTodate1() {
	waitforElement( Todate1,5);
	 Todate1.click();
	
	}
public void aactfromdate() {
	//waitforElement( fromdate,5);
	 fromdate.click();
	
	}
public void accfromdate1() {
	//waitforElement(salestodate,5);
	fromdate1.click();
	
	}
public void saveunreport() {
	//waitforElement( salesfromdate,5);
	saveunreport.click();
	
	}
public void ReprtName(String sendkey) {
    
	salesreportname.clear();
	salesreportname.sendKeys(sendkey);
    }
public void UniqueReportName(String sendkey) {
	waitforElement(salesuniquereportname,20);
	
	salesuniquereportname.sendKeys(sendkey);
    }

public void saveGenerateReport() {
	//waitforElement(saveandgeneratereport,20);
	saveandgeneratereport.click();
	
	}
}







	
	

	
	
	
	
	