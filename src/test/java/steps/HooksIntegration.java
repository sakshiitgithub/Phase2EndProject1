package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksIntegration {
	
	@Before(order = 0,value="@application")
	public void Appsetup()
	{
		System.out.println("Executing only application scenarios");
		System.out.println("The feature scenario has started");
		System.out.println("The Author is Sakshi");
		
	}
	
	@Before(order = 1,value="@course")
	public void Coursesetup()
	{
		System.out.println("Connect to Course");
	}
	
	@After(order = 1,value="@course")
	public void CourseClose()
	{
		System.out.println("Close the Course connection");
	}

	
	@After(order = 0,value="@application")
	public void teardown()
	{
		
		System.out.println("The feature scenario has completed");
		
	}

}
