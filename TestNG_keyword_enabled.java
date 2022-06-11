package TestNG;

import org.testng.annotations.Test;

public class TestNG_keyword_enabled 
{
	
	@Test
	public void TC1()
	{
		System.out.println("Running TC1");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("---login-----");
	}
	@Test
	public void login1()
	{
		System.out.println("---login1-----");
	}
	@Test(timeOut=5000)
	public void TC2() throws InterruptedException
	{
		
		Thread.sleep(4000);
		System.out.println("Running TC2");
	}
	@Test(enabled=false)
	public void TC3()
	{
		System.out.println("Running TC3");
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("---logout-----");
	}
	
	@Test
	public void TC4()
	{
		System.out.println("Running TC4");
	}
}
