package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Popup_handling.alertpopup;

public class doubleclick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	   Thread.sleep(1000);
	   
	   WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions act=new Actions(driver);
		
		act.contextClick(rclick).perform();
		//act.contextClick().perform();
		 Thread.sleep(1000);
		act.moveToElement(doubleclick).doubleClick().build().perform();
		 Thread.sleep(1000);
		Alert al=driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		
	}

}
