package DynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewsfromflipcart 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9 power");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String reviews = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		System.out.println(reviews);
		String rating= driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println(rating);
		
	}

}
