package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(src, dest).perform();
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		
	}

}
