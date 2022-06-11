package POM_DDF_with_TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{

	
	
	WebDriver  driver;
	
	
	public void openbrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{

		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		
	
}
}
