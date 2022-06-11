package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework_with_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("E:\\Software Testing\\Book2.xlsx");   //input credentials
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");//102 version
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.avatrade.com/");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//span[@class='link-btn'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());  //UserID
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());  //Password
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='button-wrapper']")).click();   //click on login button
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='aside_item__2xlHs'])[1]")).click(); //click on 3 line button//(//li[@class='aside_item__2xlHs'])[1]
		Thread.sleep(1000);
		
		String actuserID = driver.findElement(By.xpath("//h3[text()='22335382']")).getText();
		
		String expuserID=sh.getRow(1).getCell(2).getStringCellValue();  //demo ID
		
		if(actuserID.equals(expuserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
