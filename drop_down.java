package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop_down
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
//		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
//		
//		Actions act=new Actions(driver);
//		
//		act.moveToElement(loginbtn).perform();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
//		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(more).perform();
//		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Notification Preferences']")).click();
		////-----right click----
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		Actions act=new Actions(driver);
		act.moveToElement(cart).contextClick().build().perform();
		//act.contextClick().perform();   //mouse right click
	//	act.contextClick(cart).perform();
		
		
		
		
		
		
		
	}

}
