package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void testplan() 
	{
		System.out.println("great");
	}
	@Test
	public void test1plan() 
	{
		System.out.println("great");
	}
	
	@Parameters({"URL","Key"})
	@Test
	public void test2plan(String urlname, String key) 
	{
		System.out.println("great");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeTest
	public void beforetestplan() 
	{
		System.out.println("Delete Data");
	}
	
	@AfterTest
	public void aftertestplan() 
	{
		System.out.println("I will execute last");
	}
	
	@BeforeMethod
	public void beforeevery() 
	{
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void afterevery() 
	{
		System.out.println("I will execute after every method");
	}
}
