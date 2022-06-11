package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_view
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// Launch the application
				driver.get("http://demo.guru99.com/test/guru99home/");

				// find linux webelement
				WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
				
				Thread.sleep(3000);
		// This will scroll the page till the element is found
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
			}
		

		
	}


