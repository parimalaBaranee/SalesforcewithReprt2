package com.checkprojectPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.checkproject.Base.BasePage;



public class LeadPage extends BasePage {

	public LeadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@class='listRelatedObject leadBlock title']")WebElement leadtab;	
	public void clickLeadTab() {
		waitforElement(leadtab,10);
		leadtab.click();
	}

	@FindBy(id="fcf")WebElement view;	
	public void clicViewTabList() {
		view.click();
	}
	
						
public String getElementText() {
    WebElement yourElement = view; // Adjust the locator
    return yourElement.getText();
}

		public boolean isElementTextInList(List<String> stringList) {
			// TODO Auto-generated method stub
			
			String elementText = getElementText();
		//(stringList.contains(elementText));
		return stringList.contains(elementText);
		}
		
		@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")WebElement selectleadtab;		
		public void SelectLeadTab(String str) {
		Select s1=new Select(selectleadtab);
		s1.selectByVisibleText(str);
}
//@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input")WebElement clickleadtab;
@FindBy(id="name_firstlea2")WebElement firstleadname;
@FindBy(id="name_lastlea2")WebElement lastleadname;
@FindBy(id="lea3")WebElement selectleadname;
@FindBy(id="lea5")WebElement selectlead5;
@FindBy(id="lea13")WebElement selectlead6;
@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]")WebElement selectlead7;
@FindBy(xpath="//td[@class='pbButton']/input")WebElement clicknewbutton;

public void clickNewButton() {
	clicknewbutton.click();
	
}

public void FirstLeadName(String str) {
	firstleadname.sendKeys(str);
			
		}
public void LastLeadName(String str) {
	lastleadname.sendKeys(str);
			
}
	
	public void SelectLeadName(String str) {
		selectleadname.sendKeys(str);
				
			}	
	public void Selectlead5(String str) {
		Select s1=new Select(selectlead5);
		s1.selectByVisibleText(str);
				
			}	
	public void SelectLead6(String str) {
		Select s1=new Select(selectlead6);
		s1.selectByVisibleText(str);
				
			}	
	public void clickLead7() {
		selectlead7.click();
		
	}
	
@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")WebElement selectleadindex;
@FindBy(id="userNavLabel")WebElement menudropdownid;
@FindBy(xpath="//a[text()='Logout']")WebElement logoutlead;
@FindBy(xpath="/html/body/div/div[2]/table/tbody/tr/td[2]/div[3]/div[2]/table/tbody/tr[5]/td[2]/a")WebElement leadtab2;
@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input")WebElement leadtab3;

 	

	public void SelectLeadbyindex(int index) {
		Select s1=new Select(selectleadindex);
		s1.selectByIndex(index);
				
			}
	public void Menudropdownid() {
		 menudropdownid.click();
					
				}	
	public void leadlogout() {
		waitforElement(logoutlead,10);
		logoutlead.click();
					
				}	
	public void LeadTab2() {
		leadtab2.click();
					
				}	
	public void LeadTab3() {
		leadtab3.click();
					
				}	
	@FindBy(id="fcf")WebElement leadselectionunread;
	public void selectunreadoption(String str) {
		Select s1=new Select(leadselectionunread);
		s1.selectByVisibleText(str);
					
				}
	
	
}