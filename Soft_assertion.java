package Assertion_methods;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertion 
{
	@Test
	public void softAssert()
	{		
		SoftAssert soft=new SoftAssert();		
		
		String actResult="Hi";
		String expResult="Hii";
		soft.assertEquals(actResult, expResult,"Failed1: both results are diff: ");
				
		boolean actResult1=true;
		soft.assertTrue(actResult1,"Failed2: actResult is false");
		
			soft.assertAll();

	}
}
