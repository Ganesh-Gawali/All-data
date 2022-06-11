package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1_with_DDF 
{

	@FindBy(xpath="(//span[@class='link-btn'])[1]")private WebElement login1;
	@FindBy(xpath="//input[@id='input-email']")private WebElement UN;
	@FindBy(xpath="//input[@id='input-password']")private WebElement psw;
	
	
	public login1_with_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    public void inpavatradeloginbtnclick() 
    {
		login1.click();
	}
	public void inpavatradeenteruserid(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpavatradeenterpassword(String password)
	{
		psw.sendKeys(password);
	}

	
}
