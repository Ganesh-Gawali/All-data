package color_identify;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class identify_color_using_xpath 
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome-102\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.tutorialspoint.com/index.htm");
    // identify text
  //  WebElement t = driver.findElement(By.xtagName("h1"));
  //  WebElement t=driver.findElement(By.tagName("h1"));
//   WebElement t=(WebElement) driver.findElements(By.xpath("/html/body/main/section[1]/div/div/div[1]/div[2]/a[1]"));
//    //obtain color in rgba
//    String s = t.getCssValue("color");
//    // convert rgba to hex
//    String c = Color.fromString(s).asHex();
//    System.out.println("Color is :" + s);
//    System.out.println("Hex code for color:" + c);
//    driver.quit();
    
    WebElement col = driver.findElement(By.xpath("(//a[text()=' Coding Ground'])[2]"));//getCssValue("background-color");
    System.out.println("color" +  col.getCssValue("background-color"));
    System.out.println("font-weight  "  + col.getCssValue("font-weight"));

//   String hexbackcolor = Color.fromString(col).asHex();
//   System.out.println(hexbackcolor);
//   
//    if(hexbackcolor.equals("#0dba4b"))                
//    {
//    	System.out.println("pass");
//    
//	}
//    else
//    {
//    	System.out.println("Fail");
//    }
    driver.close();
}
}

