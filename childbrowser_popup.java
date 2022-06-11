package Popup_handling;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al =new ArrayList<String>(ids);
		
		String childbrowserid = al.get(1);
		String mainpageid = al.get(0);
		
	
	System.out.println(childbrowserid);
		System.out.println(mainpageid);
		driver.switchTo().window(childbrowserid);
		
		driver.findElement(By.xpath("//span[text()='Cypress'][1]")).click();
		
		Thread.sleep(300);
		driver.switchTo().window(mainpageid);
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
	}

}
