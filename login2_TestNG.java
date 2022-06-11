package POM_DDF_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2_TestNG
{
	
	@FindBy(xpath="//div[@class='button-wrapper']") private WebElement loginclick2;	
	@FindBy(xpath="(//li[@class='aside_item__2xlHs'])[1]") private WebElement clickwrpbtn;	

	
	
	public login2_TestNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonloginbtn()
	{
		loginclick2.click();
	}
	
	public void clickonwrapperbtn()
	{
		clickwrpbtn.click();
	}
	
	
	
	
	
	
	
	
	
}
