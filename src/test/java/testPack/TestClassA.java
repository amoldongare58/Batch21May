package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClassA {
	@BeforeSuite
	public void beforeSuit() 
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("before test of classA");
		
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("after test of classA");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class of classA");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method of classA");
		
	}
	

	@Test()
	public void testA()
	{
		
		System.out.println("testA of classA");
	}
	
	@Test()
	public void testC()
	{
		
		System.out.println("testC of classA");
		
	}
	
	@Test
	public void testB() 
	{
		System.out.println("testB of classA");
		
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method of classA");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("after class of classA");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("after suit");
	}
	

}
