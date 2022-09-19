package testPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import capgemTest.HomePageTest;
import capgemTest.LoginPageTest;
import impData.ExcelData;
import utility.Pojo;
import utility.Screenshot;
import utility.Wait;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

		public class TestClassB extends Pojo
		{
			WebDriver driver;
			ExtentTest logger;
			ExtentReports extent;
			
			@BeforeClass		
			public void beforeClass() 
			{
			    WebDriver driver=OpenChromeBrowser();
			    this.driver=driver;
				ExtentHtmlReporter reporter= new ExtentHtmlReporter("./test-output/velocity.html");
				 extent =new ExtentReports();
				 
				extent.attachReporter(reporter);
				 logger = extent.createTest("VerifyLoginPage");
				 logger = extent.createTest("testA");
				// logger = extent.createTest("testB");
				
			}
			
			@Test
			public void VerifyLoginPage() throws InterruptedException, IOException
			{				
				//Verify LoginPage
				
				
				LoginPageTest login=new LoginPageTest(driver);
				Wait.implicitWait(driver);
				
				login.username();
				login.password();

				login.LoginButton();
			
			
				
				
				String ActualUrl=driver.getCurrentUrl();
				Thread.sleep(2000);
				
				System.out.println(ActualUrl);
				String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	         
				/*Thread.sleep(20000);
			    boolean result=login.username();
			    System.out.println(result);
				//	Assert.assertEquals(ActualUrl, ExpectedUrl);//passed
			//	Assert.assertNotEquals(ActualUrl, ExpectedUrl);
			    Assert.assertTrue(result);
			*/
			}
			
		
			@Test()
			public void testA() 
			{
				//verify HomePage
				Assert.fail();
				HomePageTest home=new HomePageTest(driver);
				home.AdminTabClick();
			//	home.PimTabclick();
			//	home.LeaveTabClick();
			//	home.TimeTabClick();
			//	home.RecruitmentTab();
			//	home.MyInfoTab();
			}
			
//			
//			@Test()
//			public void testB() 
//			{
//				HomePageTest home=new HomePageTest(driver);
//				
//				String ActualUrl=driver.getCurrentUrl();
//				
//				
//				System.out.println(ActualUrl);
//				String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim";
//				Assert.assertEquals(ActualUrl,ExpectedUrl);
//			}
//			
//		
//			
//			
			@AfterMethod
			public void afterMethod(ITestResult result) throws IOException 
			{
				if(result.getStatus()==ITestResult.FAILURE)
				{
					String path= Screenshot.captureSS(driver);
					logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
				}
				extent.flush();
			}
//			
//			@AfterClass
//			public void afterClass() 
//			{
//				System.out.println("after class of classB");
//			}
			




}
