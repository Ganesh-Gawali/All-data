package Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_autosuggestion
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		
		String extText = "redmi note 11";
		List<WebElement> muloptions = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		
		for(WebElement options:muloptions)
		{
			String acttext = options.getText();
			if(acttext.equals(extText))
			{
				options.click();
				break;
			}
		}
		
		
	}

}