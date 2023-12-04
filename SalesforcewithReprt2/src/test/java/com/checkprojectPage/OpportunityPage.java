package com.checkprojectPage;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.checkproject.Base.BasePage;


public class OpportunityPage extends BasePage {

	public OpportunityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
	}
	@FindBy(xpath="//a[text()='Opportunities']")WebElement opporlink;
	@FindBy(id="fcf")WebElement View;
	private List<String> list;
	
	public void Opportunitylink() {
		opporlink.click();
		}
	public void clickview() {
		View.click();
		}
	 public String getElementText() {
	        WebElement yourElement = View; // Adjust the locator
	        return yourElement.getText();
	    }


	public boolean isElementTextInList(List<String> stringList) {
        String elementText = getElementText();
        return stringList.contains(elementText);
    }
	
	
	

	@FindBy(xpath="//table/tbody/tr/td[2]/input")WebElement opportunitylink1;
	@FindBy(id="opp3")WebElement teamlead;
	@FindBy(id="opp4")WebElement dataanalyst;
	@FindBy(id="opp6")WebElement needanalysis;
	@FindBy(xpath="//div[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")WebElement teamdate;
	@FindBy(id="opp11")WebElement stages;
	@FindBy(id="opp12")WebElement sendkeys1;
	@FindBy(id="opp3")WebElement savecreateopportunity;
	@FindBy(xpath="//tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")WebElement opppipeline;
	@FindBy(xpath="//tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")WebElement stucktop;
	public void OpportunityLink1() {
		opportunitylink1.click();
		}
	public void TeamLeader(String teamleadname) {
		teamlead.sendKeys(teamleadname);
		}
	public void DataAnalyst(String teamleadname) {
		dataanalyst.sendKeys(teamleadname);;
		}
	public void needanalysis(int needanal) {
		Select select1 = new Select(needanalysis);
		select1.selectByIndex(needanal);
		}
	public void Teamdate() {
		teamdate.click();
		}
	public void Duration(String needanal) {
		Select select1 = new Select(stages);
		select1.selectByVisibleText(needanal);
		}
	public void Teamsendkeys(String date) {
		 sendkeys1.sendKeys(date);
		}
	public void SaveCreateOpportunity() {
		savecreateopportunity.click();
		}
	public void checkOpportunitypipeline() {
		opppipeline.click();
		}
	

	 public boolean isOpportunitiesDropdownPresent() {
	        // Adjust the locator
	        return View.isDisplayed();
	    }
	public void selectOpportunityDropdownOption(String option) {
    
        Select select = new Select(View);
        select.selectByVisibleText(option);
    }
	public void Opportunitystucktop() {
		stucktop.click();
		}
	
	
	
	@FindBy(id="quarter_q")WebElement fy;
	public void selectQuaterlyview(String option) {
	    
        Select select = new Select(fy);
        select.selectByVisibleText(option);
    }
	
@FindBy(id="open")	WebElement include;
public void selectallopportunity(String option) {
    
	Select select1=new Select(include);
	select1.selectByVisibleText(option);
}
	
	
	@FindBy(xpath="//table/tbody/tr[3]/td/input")WebElement opplink1;
	public void clickOpportunitylink() {
		opplink1.click();
		}
	
	
	}

