package Test;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webLoginCarLoan()
	{
		//selenium
		System.out.println("Web Login Car");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() 
	{
			//appium
		System.out.println("mobile Login Car");
	}
	
	@AfterSuite
	public void bfSuit() 
	{
			//appium
		System.out.println("I am number 1 running last");
	}
	
	@Test
	public void APILoginCarLoan()
	{
		//rest api
		System.out.println("rest API Login Car");
	}
}
