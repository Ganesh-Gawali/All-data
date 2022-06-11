package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1_avatrade
{
	//step1---deceleration
	
	@FindBy(xpath="(//span[@class='link-btn'])[1]") private WebElement loginclick;
	@FindBy(xpath="//input[@id='input-email']") private WebElement userID;
	@FindBy(xpath="//input[@id='input-password']") private WebElement Password;
	@FindBy(xpath="//div[@class='button-wrapper']") private WebElement loginclcik1;
		
	//step2-Initialization----
	
	public login1_avatrade(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}
		
	
	public void clicklogin()
	{
		loginclick.click();
	}
	public void enteruserID()
	{
		userID.sendKeys("kalerupali8@gmail.com");
	}
	
	public void enetrpassword()
	{
		Password.sendKeys("T85dDtSe");
	}
	public void loginclcik1()
	{
		loginclcik1.click();
	}
	
}  
