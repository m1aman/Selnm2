package Orangehrm1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import a_generics.Baseclass_chrome;

//Runner class,DDT class,POM class,Base class, Base constant
public class All_mix extends Baseclass_chrome
{

@Test
public void Ohrm_login() throws InterruptedException
{
	Pomgen_ohrm pomg=new Pomgen_ohrm(driver); //Pomclass use ahead
	JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE use ahead
	
	String UN=DDTgen_ohrm.ddt1("Orangehrm",1,1);	//DDT use to login
	pomg.UN().sendKeys(UN);
	String PS=DDTgen_ohrm.ddt1("Orangehrm",2,1);
	pomg.PS().sendKeys(PS+Keys.ENTER);
	
	Thread.sleep(2000);
	pomg.PIM().click();  	//click PIM
	Thread.sleep(2000);
	pomg.Addemp().click();
	
	String Fname=DDTgen_ohrm.ddt1("Orangehrm",4,1); //fetch data from XML file
	pomg.Fname().sendKeys(Fname);
	String Mname=DDTgen_ohrm.ddt1("Orangehrm",5,1);
	pomg.Mname().sendKeys(Mname);
	String Lname=DDTgen_ohrm.ddt1("Orangehrm",6,1);
	pomg.Lname().sendKeys(Lname);	//altway Empid
	
	String Empid= DDTgen_ohrm.ddt1("Orangehrm",7,1);
	pomg.Empid().sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	pomg.Empid().sendKeys(Empid,Keys.BACK_SPACE, Keys.BACK_SPACE);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();",pomg.Cbox());
	
	Thread.sleep(4000);
	String Uname=DDTgen_ohrm.ddt1("Orangehrm",8,1);
	System.out.println(Uname);
	pomg.Uname().sendKeys(Uname);
	
	js.executeScript("arguments[0].scrollIntoView();",pomg.Pword1());	
	String Pword1=DDTgen_ohrm.ddt1("Orangehrm",9,1);
	pomg.Pword1().sendKeys(Pword1);
	String Pword2=DDTgen_ohrm.ddt1("Orangehrm",10,1);
	pomg.Pword2().sendKeys(Pword2);	
	pomg.Save().click();
	
	if(pomg.Success().isDisplayed())
	{
		Thread.sleep(2000);
		System.out.println("Yes Successful");
		String Empidd= DDTgen_ohrm.ddt1("Orangehrm",7,1);
		Thread.sleep(2000);
		pomg.Elist().click();
		pomg.Empidd().sendKeys(Empidd,Keys.BACK_SPACE,Keys.BACK_SPACE);
		pomg.Search().click();
		Thread.sleep(2000);
		pomg.Cboxx().click();
		pomg.Delete().click();
		pomg.Yesdlt().click();
		if(pomg.Scsdlt().isDisplayed())
		System.out.println("Emp deleted successfully");
	}
	else
	System.out.println("Not Successful");
	
	
	Thread.sleep(2000);
}

}
