package utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo {
	  
	
	public static WebDriver OpenChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","src"+File.separator+"test"+File.separator+"resources"+File.separator+"driver"+File.separator+"chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		  
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	    return driver;
	}

}
