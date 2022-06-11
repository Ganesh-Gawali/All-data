package TestNG;

import org.testng.annotations.Test;

public class TestNG_keyword_priprity
{
	
	
	@Test(priority=1)
	public void TC2()
	{
		System.out.println("--running TC2--");
	}
	
	@Test(priority=2)
	public void TC1()
	{
		System.out.println("--running TC1--");
	}
	@Test                 //by default priority=0
	public void TC3()
	{
		System.out.println("--running TC3--");
	}
	@Test                 //by default priority=0
	public void TC6()
	{
		System.out.println("--running TC6--");
	}
	@Test(priority=-3)                 
	public void TC4()
	{

		System.out.println("--running TC4--");
	}
	@Test(priority=1)
	public void TC5()
	{
		System.out.println("--running TC5--");
	}

}
