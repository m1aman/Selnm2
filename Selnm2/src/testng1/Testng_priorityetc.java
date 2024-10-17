package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_priorityetc 
{

	@Test (priority=-1)
	void D()
	{
	Reporter.log("aman",true);

	}
	
	@Test (priority=0)
	static void C()
	{
		Reporter.log("hic",true);
	}
	
	@Test(dependsOnMethods = "C")
	static void B()
	{
		Reporter.log("hib",true);
	}
	
	@Test
	static void A()
	{
		Reporter.log("hia",true);
	}
	
	
}
