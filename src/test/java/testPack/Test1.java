package testPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class Test1 {
	
	
	
	
	

	

	  WebDriver driver;
	  @BeforeClass
	  
	  public void beforeclass()
	  {
	    
	    System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome Web Driver\\\\chromedriver_win32\\\\chromedriver.exe");
	  
	     driver= new ChromeDriver ();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
}
	  
	/*  @BeforeMethod
	  
	  public void BeforeMethod()
	  {
	    
	          LoginPage login=new LoginPage (driver);
	     
	      login.sendusername();
	      login.sendpassword();
	      login.clickonbutton();
	      String Actual_result= driver.getCurrentUrl();
	      System.out.println(Actual_result);
	      String Expected_result= ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
	      SoftAssert s= new SoftAssert ();
	      s.assertNotEquals(Actual_result, Expected_result);
	      s.assertAll();
	     }
	     
//	     HomePage home=new HomePage (driver);
//	     {
//	       home.verifyadmintab();
//	       home.verifyPIMtab();
//	       home.verifyleavetab();
//	     }
*/

