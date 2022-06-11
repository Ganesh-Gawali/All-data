package TestNG;

import org.testng.annotations.Test;

public class TestNG_keywords_enabled 
{
	
	@Test
	public void login1()
	{
		System.out.println("---login1-----");
	}
	@Test
	public void login2()
	{
		System.out.println("---login2-----");
	}
	@Test(dependsOnMethods="login1")
	public void logout()
	{
		System.out.println("---logout-----");
	}
}

