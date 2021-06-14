package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("before execution all methods is class i will run");
	}
	
	@AfterClass
	public void afterclass() 
	{
		System.out.println("after execution all methods is class i will run");
	}

	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan()
	{
		//selenium
		System.out.println("Web Login Home");
	}
	
	@Test
	public void mobileLoginHomeLoan() 
	{
			//appium
		System.out.println("mobile Login Home");
	}
	@Test(enabled=false)
	public void mobile1LoginHomeLoan() 
	{
			//appium
		System.out.println("mobile Login Home");
	}
	
	@BeforeSuite
	public void bfSuit() 
	{
			//appium
		System.out.println("I am number 1");
	}
	
	@Test(timeOut=4000)
	public void mobile2LoginHomeLoan() 
	{
			//appium
		System.out.println("mobile Login Home");
	}
	
	@Test(dependsOnMethods= {"webLoginHomeLoan","mobileLoginHomeLoan"})
	public void APILoginHomeLoan()
	{
		//rest api
		System.out.println("rest API Login Home");
	}
}
