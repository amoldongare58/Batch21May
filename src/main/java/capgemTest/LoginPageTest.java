package capgemTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import impData.ExcelData;




public class LoginPageTest extends ExcelData{
	WebDriver driver;
	
	 @FindBy(xpath="//input[@name='username']")	 
	 private WebElement username;
	 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement password;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement LoginButton;
	 
	 public LoginPageTest(WebDriver driver) 
	 {
		
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	 }
	 
	 
	 public void username() throws EncryptedDocumentException, IOException 
	 {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //  username.sendKeys(getDataFromExcel("D:\\\\ExcelHandling\\\\ExcelSheet.xlsx","Sheet1",0,0));
		// boolean result=username.isDisplayed();
		username.sendKeys("Admin");
		 //return result;
		
	 }
	 
	 public void password() 
	 {
		 password.sendKeys("admin123");
	 }
	 
	 public void LoginButton() 
	 {
		 LoginButton.click();
	 }



}
