package ex_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2_POMclass
{
	@FindBy(xpath="//div[@class='button-wrapper']")private WebElement login2;
	@FindBy(xpath="(//li[@class='aside_item__2xlHs'])[1]")private WebElement wrpclick;
	
	public login2_POMclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login2()
	{
		login2.click();
	}
	
	public void wrapperbtnclick()
	{
		wrpclick.click();
	}
}


