package ex_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_class
{
	@FindBy(xpath="//h3[text()='22335382']")private WebElement demoID;

	
	public Home_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	public void verifydemoID() throws InterruptedException
	{
		String expID = demoID.getText();
		  String actID = "22335382";
		  
		  
		  if(expID.equals(actID))
		  {
			  System.out.println("Pass");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }
		  
		  
		  
		  
	}
	
}
