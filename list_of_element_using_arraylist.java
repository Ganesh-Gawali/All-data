package listofelement_using_array;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list_of_element_using_arraylist
{
	public static <WebElements> void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		
	    for(int i = 0; i < tabs.size(); i++)
	    {
	        driver.switchTo().window(tabs.get(i));
	        System.out.println(driver.getTitle());
	    }
		
		driver.close();
	}

}
