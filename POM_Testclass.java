package ex_POM_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Testclass
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
	WebDriver  driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.manage().window().maximize();		
	
	driver.get("https://www.avatrade.com/");
	
	Thread.sleep(500);
	
	login1_POMclass login=new login1_POMclass(driver);
	login.login1();
	login.enterUN();
	login.enterpassword();
	
	login2_POMclass login1=new login2_POMclass(driver);
	login1.login2();
	login1.wrapperbtnclick();
	
	Home_class home=new Home_class(driver);
	home.verifydemoID();
	
	Thread.sleep(500);
	
	driver.close();
	
	
	
	
}
}
