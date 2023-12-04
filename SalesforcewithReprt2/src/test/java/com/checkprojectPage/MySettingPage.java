package com.checkprojectPage;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.checkproject.Base.BasePage;


public class MySettingPage extends BasePage{

	public MySettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//img[@title='Edit Profile'][1]")WebElement EditMyprofile;
		
		public void clickEditprofile() {
			//waitforElement(EditMyprofile,5);
			EditMyprofile.click();
		}
		@FindBy(xpath = "//a[contains(text(),'My Profile')]")WebElement Selectmyprofile;
		public void clickmyprofile() {
			waitforElement(Selectmyprofile,5);
			Selectmyprofile.click();
		}
		@FindBy(xpath = "//a[contains(text(),'My Settings')]")WebElement Selectmysetting;
		@FindBy(id="PersonalInfo_font")WebElement personalfont;
		@FindBy(id="LoginHistory_font")WebElement Loginhistoryfont;
		@FindBy(className="pShowMore")WebElement pshowmore;
		@FindBy(id="DisplayAndLayout_font")WebElement displaylayoutandfont;
		@FindBy(id="CustomizeTabs_font")WebElement customizetab;
		@FindBy(id="p4")WebElement selectsalesforcechatter;
		@FindBy(xpath ="//a[@id='duel_select_0_right']/img")WebElement Selectarrow;		
		@FindBy(xpath ="//table/tbody/tr/td[@id='bottomButtonRow']/input[1]")WebElement Save;
		@FindBy(id="EmailSetup_font")WebElement emailfont;
		@FindBy(id="EmailSettings_font")WebElement Emailsettingfont;
		@FindBy(id="sender_name")WebElement sendername;
		@FindBy(id="sender_email")WebElement Senderemail;
		@FindBy(id="auto_bcc1")WebElement autoclick;
		@FindBy(xpath = "//input[@title='Save']")WebElement save;
		@FindBy(id="CalendarAndReminders")WebElement CalendarReminders;
		@FindBy(id="Reminders_font")WebElement remindersfont;
		@FindBy(id="testbtn")WebElement Testactivity;
		public void clickmysettings() {
			Selectmysetting.click();
			
		}
		public void Personalfont() {
		personalfont.click();
			
		}
		public void Loginhistoryfonttype() {
			Loginhistoryfont.click();
			
		}
		public void pageshowmore() {
			 pshowmore.click();
			
		}
		public void displaylayoutandfonttype() {
			displaylayoutandfont.click();
			
		}
		public void showcustomizetab() {
			customizetab.click();
			
		}
		public void salesforcechatter() {
			waitforElement(selectsalesforcechatter,5);
			Select select = new Select(selectsalesforcechatter);
			select.selectByVisibleText("Salesforce Chatter");
			
		}

		
		public void selectarrow() {
			Selectarrow.click();
			
		}	
		public void savebutton() {
			
			Save.click();
			
		}	
		public void Emailfont() {
			waitforElement(emailfont,5);
			emailfont.click();
			
		}	
		public void Emailsettingfontt() {
			
			Emailsettingfont.click();
			
		}	
		
		public void Sentname(String sendernamevalue) {
		
			sendername.clear();
			sendername.sendKeys(sendernamevalue);
			
		}	
		public void senderEmail(String sendemail) {
			
			Senderemail.clear();
			Senderemail.sendKeys(sendemail);
			
		}	
	public void Autoclick() {
			
		autoclick.click();
			/*if (!autoclick.isSelected()) {
		        // Click the radio button to select it
				autoclick.click();
				//switchToNewWindow(autoclick);
				//waitforElement(autoclick,20);
				//alert(autoclick);
				//waitforElement(autoclick,20);}*/
				
		    }

	//public void alert(WebElement save) {
	//	activeelement(save);
		
	//}

			public void elementsubmit() {
				
				//alert(save);
				save.click();
				
				waitforElement(autoclick,20);	
				
				
		}	
		public void calendarremaindar() {
			
			waitforElement(CalendarReminders,100);	
			CalendarReminders.click();
				
			
		}
	 	//String parentWindow=driver.getWindowHandle();
	//System.out.println(parentWindow);
		public void remainderfont() {
				
			remindersfont.click();
					
				
		}
		public void Testactivity1() {
			
			Testactivity.click();
				
				
		}


	@FindBy(xpath = "//a[text()='Developer Console']")WebElement developerconsole;
	public void selectdeveloperconsole()
	{
		
		 developerconsole.click();
		
		
	}



	@FindBy(xpath="//*[@id=\"aboutTab\"]/a")WebElement Abouttab;
	@FindBy(id="lastName")WebElement lastname;
	@FindBy(xpath="//input[@value='Save All']") WebElement saveall;

	public void AboutTestactivity1() {
		
		Abouttab.click();	
	}
	public void AboutTestactivitylastactivity(String str) {
		lastname.clear();
		lastname.sendKeys(str);;
				
	}

	public void SaveAll() {
		
		saveall.click();	
	}


	//Photo Upload

	//Thread.sleep(20000);

	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")WebElement choosephoto;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")WebElement savephoto;
	@FindBy(id="publisherAttachContentPost")WebElement Filelink;
	//@FindBy(xpath="//li[@label='ContentPost']/a")WebElement Filelink1;
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")WebElement savephoto1;
	@FindBy(xpath="//a[@id='chatterUploadFileAction']")WebElement choosefile;
	public void uploadphotosprofile(String str)
	{
		waitforElement(choosephoto,100);
	choosephoto.sendKeys(str);
	}

	public void Savephoto() {
		waitforElement(savephoto,250);
		savephoto.click();	
	}

	public void Savephoto1() {
		waitforElement(savephoto1,250);
		savephoto1.click();	
		System.out.println("Photo uploaded successfully");
	}

	//FileUpload
	// By elementLocator = By.id("publisherAttachContentPost");
	public void FileLinkClick() {
	waitforElement(Filelink,60);
		
WebDriverWait wait = new WebDriverWait(driver, 250);
	 
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Filelink));
 element.click();	
	}

	public void ChooseFileClick() {
		waitforElement(choosefile,100);
		choosefile.click();	
	}

	@FindBy(xpath="//input[@type='file']")WebElement fileupload;
	@FindBy(id="publishersharebutton")WebElement sharebutton;

	public void Fileupload(String str) {
		//waitforElement(fileupload,30);
	fileupload.sendKeys(str);
	}

	public void publishersharebutton() {
		
		sharebutton.click();	
		System.out.println("File uploaded successfully");
	}

	//post message
	@FindBy(id="publisherAttachTextPost")WebElement postlink;
	public void postlink() {
		
		postlink.click();	
		
	}

	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));


	@FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")WebElement pathframe;


	private WebElement pathFrameText() {
		// TODO Auto-generated method stub
		WebElement path=pathframe;
		return path;
	}



	@FindBy(xpath="//body[contains(text(),'Share')]")WebElement postmsgText1;
	@FindBy(id="publishersharebutton")WebElement share;
	@FindBy(xpath="//a[@id='uploadLink']")WebElement mhover;
	public void postmsgText1(String str) {
		
		postmsgText1.sendKeys(str);	
		
	}

	public void publishersharepost() {
		
		 share.click();	
		 System.out.println("Post link is clicked and share the text");
		
	}

	public void actionmoveelement() {

	Actions action=new Actions(driver);

	action.moveToElement(mhover).click().build().perform();

	}
//program 5	
	@FindBy(id="userNavLabel")WebElement menudropdown;
	
	
	}
























