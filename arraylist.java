package listofelement_using_array;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylist
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	 //   driver.close();
	    driver.switchTo().window(tabs2.get(1));
	    WebElement tes = driver.findElement(By.xpath("//div[@class='_37M3Pb']"));
	    tes.getText();
		
		
		
		
	}

}
