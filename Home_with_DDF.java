package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_with_DDF
{

         @FindBy(xpath="//h3[text()='22335382']")private WebElement demoID;
	
	public Home_with_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifydemoidavatrade(String expuserID)
	{
		String actID = demoID.getText();
		
		
		if(actID.equals(expuserID))
		
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	
	}
}
