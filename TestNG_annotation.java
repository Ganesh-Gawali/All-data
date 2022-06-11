package TestNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_annotation 
{

@BeforeClass
public void openbrowser()
{
	Reporter.log("-----Open Browser----",true);
}
	
@BeforeMethod
public void login()
{
	Reporter.log("----login----",true);
}

@Test
public void verifyuserID()
{
	Reporter.log("-----verify user ID ----",true);
}
@Test
public void verifyuserID1()
{
	Reporter.log("-----verify user ID1 ----",true);
}

@AfterMethod
public void logout()
{
	Reporter.log("----logout---",true);
}

@AfterClass
public void closebrowser()
{
	Reporter.log("----close browser----",true);
}










}
