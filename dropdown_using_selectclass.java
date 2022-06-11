package dropdown_using_selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_using_selectclass
{
	public static void main(String[] args) throws InterruptedException
{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome\\\\Chrome-102\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
				js.executeScript("arguments[0].click();",button);
		Select se =new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
			
    // se.selectByIndex(3);
		se.selectByVisibleText("May");
		
		
		System.out.println("May");
		
		driver.close();
	}

}
