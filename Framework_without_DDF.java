package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework_without_DDF 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	//	driver.get("https://www.forextime.com/");
		driver.get("https://www.avatrade.com/");
		
	//	driver.findElement(By.xpath("//a[text()='Register now']")).click();
		
		driver.findElement(By.xpath("(//span[@class='link-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kalerupali8@gmail.com");
	
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("T85dDtSe");
		driver.findElement(By.xpath("//div[@class='button-wrapper']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='aside_item__2xlHs'])[1]")).click();
		
		

	String actuserID = driver.findElement(By.xpath("//h3[text()='22335382']")).getText();
	//String actuserID = driver.findElement(By.xpath("h3[@class='menu_account__11K6m']")).getText();
	
	String expuserID="22335382";
		
		if(actuserID.equals(expuserID))           ////h3[@class='menu_account__11K6m']
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	
	}

}
