package customized_listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class select_option
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.click(element).perform();
		//act.sendKeys(Keys.ENTER).perform();
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
