package com.checkprojectPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.checkproject.Base.BasePage;


public class VerificationPage extends BasePage{

	public VerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()='Home']")WebElement clickhome;
	@FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")WebElement loginlink1;
	@FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")WebElement myprofileuserFullNameElement;
	  @FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")WebElement loginlink;
	  @FindBy(xpath="//span[@id='tailBreadcrumbNode']")WebElement homeuserFullNameElement;
	public void clickhome()
	{
		clickhome.click();
	}
	
	public String homename()
	{
		 String s1= myprofileuserFullNameElement.getText().trim();
		 return s1;
	}
	
   	
     public void myprofilelink()
 	{
    	 loginlink.click();
 	}
	
	public String myprofilename()
	{
		 String s2=homeuserFullNameElement.getText().trim();
		 return s2;
	}
@FindBy(xpath="//li[@id=\"AllTab_Tab\"]/a/img")WebElement clickplussymbol;
@FindBy(xpath="//input[@value='Customize My Tabs']")WebElement customizetab;  
@FindBy(id="duel_select_1")WebElement selectoption;	

@FindBy(xpath="//a[@id='duel_select_0_left']")WebElement removeselectoption;	
@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")WebElement save;	
@FindBy(id="userNavLabel")	WebElement menudropdown;
	 public void clickplusSymbol()
	 	{
		 clickplussymbol.click();
	 	}
	
	 public void clickcustomizetab()
	 	{
		 customizetab.click();
	 	}
	
	 public void clickselectoption(String str)
	 	{
		 Select option=new Select(selectoption);
		 option.selectByVisibleText(str);
	 	}
	
	 public void RemoveSelectOption()
	 	{
		 removeselectoption.click();
	 	}
	
	 public void clicksavecustomizetab()
	 	{
		 save.click();
	 	}
	
	 public void clickmenudropdown()
	 	{
		 menudropdown.click();
	 	}
	 @FindBy(xpath="//ul[@id=\"tabBar\"]") List<WebElement> listElements;
	private List<WebElement> listElement=listElements; 
	
public void verifysubscription()
{
	String searchText="Subscriptions";
	
    boolean textFound = false;

    // Iterate through each element in the list
    for (WebElement element : listElement) {
        // Get the text of each element
        String elementText = element.getText();

        // Check if the desired text is present in the element
        if (elementText.contains(searchText)) {
            textFound = true;
            break; // Exit the loop if the text is found
        }
    }

    // Check if the text is present in the list or not
    if (textFound) {
        System.out.println("The text '" + searchText + "' is present inside the list.");
    } else {
        System.out.println("The text '" + searchText + "' is not present inside the list.");
    }
}
   @FindBy(xpath="//span[@class='pageDescription']/a") WebElement currentdatelink;
   @FindBy(xpath="//div[@id='p:f:j_id25:j_id61:28:j_id64']/a")WebElement selecttimelink;
   @FindBy(xpath="//a[contains(text(),'Other')]") WebElement selectedOption ;
   @FindBy(xpath="//img[@class='comboboxIcon']")WebElement selectsubject;
	 public void clickcurrentdatelink()
	 	{
		 currentdatelink.click();
	 	}
		
	 public void clickselecttimelink()
	 	{
		 selecttimelink.click();
	 	}
		
	 public void clickselectsubject()
	 	{
		// waitforElement(selectsubject,10);
		 selectsubject.click();
		
	 	}
	
	 public void clickselectoption()
	 	{
		// waitforElement(selectoption,10);
		 selectedOption.click();
		
	 	}
        
     @FindBy(id="EndDateTime_time")WebElement endTime;
       
        public void clickEndtime()
	 	{
        	endTime.click();
	 	}
		
      @FindBy(xpath="//div[contains(text(),'9:00 PM')]")  WebElement timepicker;
      public void clicktimepicker()
	 	{
    	  timepicker.click();
	 	}
		
     @FindBy(name="save") WebElement savecalendarevent;
     public void SaveCalendarEvent()
	 	{
    	 savecalendarevent.click();
	 	}
     
   //program34
     
   @FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")  WebElement firstandlastnameloginlink;
   public void FirstandLastnamelink()
	{
	   firstandlastnameloginlink.click();
	}
 	
 	
 	  
 	@FindBy(xpath="//img[@title='Edit Profile']")WebElement editprofile;
 	public void EditProfile()
	{
 		editprofile.click();
	}
 	
 	 	
 @FindBy(xpath="//*[@id=\"aboutTab\"]/a")WebElement Abouttab;
 public void AboutTab()
	{
	 Abouttab.click();
	}
	
 	@FindBy(id="lastName")WebElement lastname;
 	
 	public void lastname(String str)
 	{
 	lastname.clear();
 	System.out.println(lastname.getText());
 	lastname.sendKeys(str);
 	}
 	
 	
@FindBy(xpath="//input[@value='Save All']") WebElement saveall;
 //explicitWait(saveall,10);
public void SaveAll()
	{
	saveall.click();
	System.out.println("The Username is displayed on the home page");
	}
 	
 //program37
 
@FindBy(xpath="//div[contains(text(),'8:00 PM')]")  WebElement timepicker1;
public void clicktimepicker1()
	{
	  timepicker1.click();
	}
	
@FindBy(xpath="//input[@id='IsRecurrence']")WebElement checkrecurrence;
public void checkisrecurrence()
{
	checkrecurrence.click();
}

@FindBy(id="rectypeftw")WebElement selectweeklyfrequency;
public void selectweeklyfrequency()
{
	selectweeklyfrequency.click();
}

@FindBy(id="RecurrenceEndDateOnly")WebElement calculatelastdate;
public void calculateDate()
{
	calculatelastdate.click();
}

@FindBy(xpath="//a[@class='calToday']")WebElement calculatelastdate1;
public void calculateDate1()
{
	calculatelastdate1.click();
}

@FindBy(xpath="//td[@id='bottomButtonRow']/input[1]")WebElement saveweeklyrecurrence;
public void SaveWeeklyrecurrence()
{
	saveweeklyrecurrence.click();
}

@FindBy(xpath="//div[@id='bCalDiv']/div/div[2]/span[2]/a[3]/img")WebElement monthview;
public void MonthView()
{
	monthview.click();
}
}



