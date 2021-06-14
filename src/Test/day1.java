package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups= {"Smoke"})
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
	@Test(dataProvider="getData")
	public void demo1(String username, String password) 
	{
		// TODO Auto-generated method stub
		System.out.println("bye");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		//1st combination - username - password -good credit history
		//2st combination - username - password -no credit history
		//3st combination - username - password -fraudent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstusername";
		data[0][1] = "password";
		
		//2st set
		data[1][0] = "2ndusername";
		data[1][1] = "password";
				
		//3st set
		data[2][0] = "3rdusername";
		data[2][1] = "password";
		
		return data;
	}

}
