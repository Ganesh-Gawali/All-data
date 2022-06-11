package Baseclass_utilityclass;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_with_TestNG.Home_POM_DDF_TestNG;
import POM_DDF_with_TestNG.login1_TestNG;
import POM_DDF_with_TestNG.login2_TestNG;

public class Baseclass 
{

	
//	Sheet sh;
	WebDriver  driver;
	
	
	public void openbrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		
		
		
	}
}
	