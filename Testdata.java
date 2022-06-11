package POM_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdata 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		Thread.sleep(500);
		
		
		login1_avatrade login1=new login1_avatrade(driver);
				login1.clicklogin();
		login1.enteruserID();
		login1.enetrpassword();
		login1.loginclcik1();
		
		login2_avatrade login2=new login2_avatrade (driver);
		
		login2.wrapperclickbtn();
		
		
		
		homepage_avatrade home=new homepage_avatrade(driver);
		
		home.verifydemoid();
		
		Thread.sleep(500);
		
		driver.close();
		
	}

}
