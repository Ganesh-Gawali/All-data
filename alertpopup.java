package Popup_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		  Alert alt = driver.switchTo().alert();
		  String text = alt.getText();
		  System.out.println(text);
		  
		//  alt.dismiss();
		  alt.accept();
		  
		  Thread.sleep(300);
		  
		  alt.accept();
		  
		
		
	}

}
