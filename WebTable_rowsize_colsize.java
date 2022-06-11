package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_rowsize_colsize
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("file:///E:/Software%20Testing/notepad%20program/Webtable.html");
	
	int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	System.out.println("Table row size " +   rowsize);
	
	int colsize = driver.findElements(By.xpath("(//table[@id='1234']//tr)[2]/td")).size();
	System.out.println("Table col size " +  colsize);
	
	int hsize = driver.findElements(By.xpath("(//table[@id='1234']//tr)[1]/th")).size();
	System.out.println("Table Header size " +  hsize);
	
	
	String text = driver.findElement(By.xpath("(//table[@id='1234']//tr)[2]/td[2]")).getText();
	System.out.println(text);
	
	 String htext = driver.findElement(By.xpath("(//table[@id='1234']//tr)[1]/th")).getText();
	 System.out.println(htext);
	
	
	
}
}
