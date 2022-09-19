package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	     
	      
	     public static String captureSS(WebDriver driver) throws IOException 
		{
	    	
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			 Date d= new Date();
     		
		       
		        SimpleDateFormat AddDate=new SimpleDateFormat("ddMMYYYY_HHmmsss");
		        
		        String time=AddDate.format(d);
				
		        String path="D:\\Screenshot\\Facebook_SS\\Img "+time+".jpeg";
				
		        File dest=new File(path);
		        FileHandler.copy(source, dest);
		        return path;
		        //FileUtils.copyFile(source, dest);
			
			
		}

}
