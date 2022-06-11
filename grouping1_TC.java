package Grouping_TC;

import org.testng.annotations.Test;

public class grouping1_TC 
{
	@Test(groups="profile")
	public void TC1()
	{
		System.out.println("--running TC1--");
	}

	@Test(groups="login")
	public void TC2()
	{
		System.out.println("--running TC2--");
	}
	@Test(groups="login")
	public void TC3()
	{
		System.out.println("--running TC3--");
	}

	@Test(groups="logout")
	public void TC4()
	{
		System.out.println("--running TC4--");
	}

	@Test(groups="profile")
	public void TC5()
	{
		System.out.println("--running TC5--");
	}


}
