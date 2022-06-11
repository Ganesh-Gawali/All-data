package multibrowser_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex2_multibrowsertesting 
{
	
    @Parameters("browsername")
	@Test
	public void multibrowserTC(String browsername) throws InterruptedException
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
		driver.get("https://www.avatrade.com/");
		
		driver.findElement(By.xpath("(//span[@class='link-btn'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kalerupali8@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("T85dDtSe");
		driver.findElement(By.xpath("//div[@class='button-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='aside_item__2xlHs'])[1]")).click();
		String actdemoID = driver.findElement(By.xpath("//h3[text()='22335382']")).getText();
		
		String expdemoID = "22335382";
		
		if(actdemoID.equals(expdemoID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		//Thread.sleep(1000);
		driver.quit();
	}

}
