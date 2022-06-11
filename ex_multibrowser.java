package multibrowser_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex_multibrowser 

{ 
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException
	{
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();	
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Chrome\\geckodriver-v0.31.0-win64\\geckodriver.exe");
   		 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
    	
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(500);
     	driver.close();
	}

}
