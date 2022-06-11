package POM_DDF_with_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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



public class POM_DDF_TestNG
{
	
	login1_TestNG login1;
	login2_TestNG login2;
	Home_POM_DDF_TestNG home;
	Sheet sh;
	WebDriver  driver;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Book2.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		Thread.sleep(500);
		
		 login1=new login1_TestNG(driver);
		 login2=new login2_TestNG(driver);
		 home=new Home_POM_DDF_TestNG(driver);
		
		
	}
	@BeforeMethod
	public void logintoapp()
	{
		login1.inputlogin1page();
		login1.enteruserID(sh.getRow(1).getCell(0).getStringCellValue());
		login1.enterpassword(sh.getRow(1).getCell(1).getStringCellValue());
	
		login2.clickonloginbtn();
		login2.clickonwrapperbtn();
		
		
	}
	
	@Test
	public void verifydemoID()
	{
		String actdemoID = home.verifydemoID();
		String expdemoID = sh.getRow(1).getCell(2).getStringCellValue();
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
