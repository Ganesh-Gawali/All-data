package WebTable

import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class WebTable_rowsize_colsize {
	def static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS)
		driver.manage().window().maximize()
		driver.get("file:///E:/Software%20Testing/notepad%20program/Webtable.html")
		var int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size()
		System.out.println('''Table row size «rowsize»''')
		var int colsize = driver.findElements(By.xpath("(//table[@id='1234']//tr)[2]/td")).size()
		System.out.println('''Table col size «colsize»''')
		var int hsize = driver.findElements(By.xpath("(//table[@id='1234']//tr)[1]/th")).size()
		System.out.println('''Table Header size «hsize»''')
		var String text = driver.findElement(By.xpath("(//table[@id='1234']//tr)[2]/td[2]")).getText()
		System.out.println(text)
		var String htext = driver.findElement(By.xpath("(//table[@id='1234']//tr)[1]/th")).getText()
		System.out.println(htext)
	}
}
