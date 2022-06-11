package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;



public class assert_equals 
{

	@Test
	public void assertequals()
	{
		
	String str1="Hi";
	String str2="Hii";
	Assert.assertEquals(str1, str2,"Failed: both result are diff ");
	boolean actresult = true;
	
	Assert.assertTrue(actresult,"Failed");
	//Assert.assertNotEquals(str1, str2, "Failed: both result are same");
	
	}
	@Test
	public void assertnotequals()
	{
		
	String str1="Hi";
	String str2="Hii";
	//Assert.assertEquals(str1, str2,"Failed: both result are diff ");
	Assert.assertNotEquals(str1, str2, "Failed: both result are same");
	
	}
	
	@Test
	public void asserttrue()
	{
	boolean actresult = true;
	
	Assert.assertTrue(actresult,"Failed");
	
	}
	@Test
	public void assertfalse()
	{
	boolean actresult = false;
	
	Assert.assertFalse(actresult,"Failed");
	
	}
	@Test
	public void assertnull()
	{
		String actresult = null;
		Assert.assertNull(actresult,"Failed");
	
	}
	@Test
	public void assertnotnull()
	{
		String actresult = "abc";
		Assert.assertNotNull(actresult,"Failed");
	}
	
	
	
}

