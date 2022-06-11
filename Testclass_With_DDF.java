package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass_With_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Book2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		
		login1_with_DDF  login1=new login1_with_DDF (driver);
				login1.inpavatradeloginbtnclick();
				String un = sh.getRow(1).getCell(0).getStringCellValue();
				login1.inpavatradeenteruserid(un);
				String pass = sh.getRow(1).getCell(1).getStringCellValue();
				login1.inpavatradeenterpassword(pass);
		
				login2_with_DDF login2=new login2_with_DDF(driver);
				login2.clickonloginbtnavatrade();
				login2.clickonwrapperbtnavatrade();
				
				
				Home_with_DDF home=new Home_with_DDF(driver);
						
                       String dID = sh.getRow(1).getCell(2).getStringCellValue();				
		           home.verifydemoidavatrade(dID);
		           
		           Thread.sleep(500);
		            
		           driver.close();
		
	}

}
