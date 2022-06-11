package Ex_baseclass_utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utilityclass_ex 
{
	
	// This method is used to get test data fro excel sheet
	//Need to pass parameter-rowInedx and cellIndex
	//Author name-Rupali
	public static String getexcelsheetdata(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\selenium_setup\\Testdata\\Book2.xlsx"); //path from folder created in ecpispe
	 String value = WorkbookFactory.create(file).getSheet("Sheet4").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	 return value;
	}
	
	
	//this method is use to capture screenshot of webpage
		//need to pass 2 parameters : 1-webdriver object 2- TestCaseID
		//Author name: Rupali

	public static void screenshot(WebDriver driver,int TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Shree\\eclipse-workspace\\selenium_setup\\Screenshot\\Screenshot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
     public static String getdata(String key) throws IOException
     {
    	 FileInputStream file=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\selenium_setup\\avaTrade.property");
         Properties p=new Properties();
         p.load(file);
       String value = p.getProperty(key);
     
       return value;
     }
     

}
