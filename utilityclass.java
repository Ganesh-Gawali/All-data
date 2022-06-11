package POM_DDF_with_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass
{
	
	private static final String Outputtype = null;

	// This method is used to get test data fro excel sheet
	//Need to pass parameter-rowInedx and cellIndex
	//Author name-Rupali
	public static String getexcelsheetdata(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("E:\\Software Testing\\Book2.xlsx");
	 String value = WorkbookFactory.create(file).getSheet("Sheet4").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	 return value;
	}
	
	
	//this method is use to capture screenshot of webpage
		//need to pass 2 parameters : 1-webdriver object 2- TestCaseID
		//Author name: Rupali

	public static void screenshot(WebDriver driver,int TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Screenshot\\screenshot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}

	
	
}

