package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_keywords_invocationCount
{
	
	@Test(invocationCount=5)
	public void m1()
	{
		Reporter.log("----Multiple time M1 run---",true);
	}
	
	
	@Test(invocationCount=2)
	public void m2()
	{
		Reporter.log("----Multiple time M2 run---",true);
	}
	
	
	
	
	
	
	
	
	
	
	

}
