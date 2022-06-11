package POM_DDF_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_POM_DDF_TestNG
{
	
	@FindBy(xpath="//h3[text()='22335382']")private WebElement demoID;

	
	public Home_POM_DDF_TestNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifydemoID()
	{
		String actdemoID = demoID.getText();
		return actdemoID;
	}
	
}
