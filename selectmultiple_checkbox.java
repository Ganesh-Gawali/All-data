package Handlingof_MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmultiple_checkbox
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///E:/Software%20Testing/notepad%20program/checkbox.html");
	
	 List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for( WebElement s1:allcheckbox)
	{
		s1.click();
		Thread.sleep(1000);
	}
	for(int i=allcheckbox.size()-1;i>=0;i--)   //deselect from reverse order
	{
		allcheckbox.get(i).click();
		Thread.sleep(1000);
	}
	int checkboxsize = allcheckbox.size();
	System.out.println(checkboxsize);        //size of checkbox
	
//	List<WebElement> allcheckbox = driver.findElements(By.xpath("input[@type='checkbox']"));
//	
//	for(WebElement s1:allcheckbox)
//	{
//	s1.click();
//		Thread.sleep(2000);
//	}
//	
//	
//	////input[@type='checkbox']

}
}

