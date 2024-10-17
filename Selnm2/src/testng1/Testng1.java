package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 
{
	@Test
	public void test1()
	{
		Reporter.log("hi",true);
	}
}
