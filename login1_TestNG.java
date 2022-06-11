package POM_DDF_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1_TestNG 
{
	@FindBy(xpath="(//span[@class='link-btn'])[1]") private WebElement loginclick1;	
	@FindBy(xpath="//input[@id='input-email']") private WebElement userID;	
	@FindBy(xpath="//input[@id='input-password']") private WebElement pwd;	
	
	
	public login1_TestNG(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inputlogin1page()
	{
		loginclick1.click();
	}
	public void enteruserID(String username)
	{
		userID.sendKeys(username);
	}
	public void enterpassword(String password)
	{
		pwd.sendKeys(password);
	}
}
