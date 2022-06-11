package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2_avatrade 
{

	@FindBy(xpath="(//li[@class='aside_item__2xlHs'])[1]")	private WebElement wrapperbtn;
	
	
	
//	public login2_avatrade (WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
	public login2_avatrade(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}

	public void wrapperclickbtn()
	{
		wrapperbtn.click();
	}
	
}

