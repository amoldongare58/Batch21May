package capgemTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageTest{
	  WebDriver driver;
	 @FindBy(xpath="//*[text()='Admin']")
	 private WebElement AdminTab;
	 
	 @FindBy(xpath="//*[text()='PIM']")
	 private WebElement PimTab;
	 
	 @FindBy(xpath="//*[text()='Leave']")
	 private WebElement LeaveTabClick;
	 
	 @FindBy(xpath="//*[text()='Time']")
	 private WebElement TimeTabClick;
	 
	 @FindBy(xpath="//*[text()='Recruitment']")
	 private WebElement RecruitmentTab;
	
	 @FindBy(xpath="//*[text()='My Info']")
	 private WebElement MyInfoTab;
	 
	// @FindBy(xpath="//div[text()='Admin']")
	// private WebElement Dropdown;
	 
	//*[text()='My Info']
			 
	 public HomePageTest(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void AdminTabClick() 
	 {
		 
		   String AdminTabtext=AdminTab.getText();
		   System.out.println(AdminTabtext);
		   boolean display=AdminTab.isDisplayed();
		   System.out.println(display);
		   AdminTab.click();
		   
		   
		  // Select s= new Select(Dropdown);
			//s.selectByVisibleText("Admin");
		   
		   
	 }
	 
	 public void PimTabclick() 
	 {
		 String PimTabText=PimTab.getText();
		 System.out.println(PimTabText);
		 boolean PimDisplay=PimTab.isDisplayed();
		 System.out.println(PimDisplay);
		 PimTab.click();
		 
	 }
	 
	 public void LeaveTabClick() 
	 {
		 String LeaveTabText=LeaveTabClick.getText();
		 System.out.println(LeaveTabText);
		 boolean LeaveTabDisplay=LeaveTabClick.isDisplayed();
		 System.out.println(LeaveTabDisplay);
		 LeaveTabClick.click();;
		 
	 }
	 
	 public void TimeTabClick() 
	 {
		 String TimeTabtext=TimeTabClick.getText();
		 System.out.println(TimeTabtext);
		 boolean TimeTabDisplay=TimeTabClick.isDisplayed();
		 System.out.println(TimeTabDisplay);
		 TimeTabClick.click();
	 }
	 
	 
	 public void RecruitmentTab() 
	 {
		 String RecruitmentTabText=RecruitmentTab.getText();
		 System.out.println(RecruitmentTabText);
		 boolean RecruitmentTabDisplay=RecruitmentTab.isDisplayed();
		 System.out.println(RecruitmentTabDisplay);
		 RecruitmentTab.click();
	 }
	 

	 public void MyInfoTab() 
	 {
		 String MyInfoTabText=MyInfoTab.getText();
		 System.out.println(MyInfoTabText);
		 boolean MyInfoTabDisplay=MyInfoTab.isDisplayed();
		 System.out.println(MyInfoTabDisplay);
		 MyInfoTab.click();
		 
		
		 
	 }
	 
	

}
