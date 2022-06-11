package Handlingof_MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printall_links
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 
		 for(WebElement s1:alllinks)
		 {
			 System.out.println(s1.getText());
		 }
		 
		 int size = alllinks.size();
		 System.out.println(size);
		// WebElement id = alllinks.get(40);
		// System.out.println(id);
	}

}
