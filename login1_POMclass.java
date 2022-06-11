package ex_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1_POMclass 
{
	@FindBy(xpath="(//span[@class='link-btn'])[1]")private WebElement login1;
	@FindBy(xpath="//input[@id='input-email']")private WebElement  UN;
	@FindBy(xpath="//input[@id='input-password']")private WebElement  psw;
	
	public login1_POMclass(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void login1()
	{
		login1.click();
	}
	public void enterUN()
	{
		UN.sendKeys("kalerupali8@gmail.com");
	}
	
	public void enterpassword()
	{
		psw.sendKeys("T85dDtSe");
	}
	
}
