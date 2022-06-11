package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2_with_DDF
{

	@FindBy(xpath="//div[@class='button-wrapper']")private WebElement loginbtn;
	
	@FindBy(xpath="(//li[@class='aside_item__2xlHs'])[1]")private WebElement wrpbtn;
	
	
	public login2_with_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonloginbtnavatrade()
	{
		loginbtn.click();
	}
	
	public void clickonwrapperbtnavatrade()
	{
		wrpbtn.click();
	}
}
