package Popup_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision_popup
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
//	driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
	
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABC");
	
	
	
	
}
}
