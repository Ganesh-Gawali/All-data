package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage_avatrade
{
	
	@FindBy(xpath="//h3[text()='22335382']")private  WebElement demoID;
	
	
	public homepage_avatrade(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifydemoid()
	{
		String actuserID = demoID.getText();
		String expuserID = "22335382";
	
	if(actuserID.equals(expuserID))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
}
}

