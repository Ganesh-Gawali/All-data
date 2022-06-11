package Parallel_TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_TC 
{
	@Test
	public void openflipkartapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(500);
		driver.close();
	}
	

}
