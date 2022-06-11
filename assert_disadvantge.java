package Assertion_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_disadvantge 
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

}
