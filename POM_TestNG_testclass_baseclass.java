package POM_DDF_with_TestNG;

import java.io.FileInputStream;
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

import Baseclass_utilityclass.Baseclass;

public class POM_TestNG_testclass_baseclass extends baseclass    //extedns baseclass code
{

	login1_TestNG login1;
	login2_TestNG login2;
	Home_POM_DDF_TestNG home;
	
	//WebDriver  driver;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		openbrowser();   //baseclass method call in testclass
		
		 
		 login1=new login1_TestNG(driver);
		 login2=new login2_TestNG(driver);
		 home=new Home_POM_DDF_TestNG(driver);
		
		
	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException
	{
		login1.inputlogin1page();
		//login1.enteruserID(sh.getRow(1).getCell(0).getStringCellValue());
		login1.enteruserID(utilityclass.getexcelsheetdata(1, 0));
		login1.enterpassword(utilityclass.getexcelsheetdata(1,1));
	
		login2.clickonloginbtn();
		login2.clickonwrapperbtn();
		
		
	}
	
	@Test
	public void verifydemoID() throws EncryptedDocumentException, IOException
	{
		String actdemoID = home.verifydemoID();
		String expdemoID = utilityclass.getexcelsheetdata(1,2);
		//Assert.assertEquals(actdemoID,expdemoID,"Failed:");
		
		Assert.assertEquals(actdemoID, expdemoID,"Failed:both result are diff    ");
	}
	@AfterClass
	public void logout ()
	{
		
		
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}



