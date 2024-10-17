package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Avtask1 
{
@Test
void test1() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

driver.manage().window().maximize();
driver.get("https://prexahotfix.crm3.dynamics.com");

driver.findElement(By.name("loginfmt")).sendKeys("automationuser@alphavima.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.findElement(By.name("passwd")).sendKeys("Yum03075");
driver.findElement(By.xpath("//input[@value='Sign in']")).click();
driver.findElement(By.id("idSIButton9")).click();

Thread.sleep(2000);
//JavascriptExecutor js=(JavascriptExecutor) driver;
//js.executeScript("arguments[0].scrollIntoView();",test1);
//Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,500)");
//WebElement test1 = driver.findElement(By.xpath("//div[@title='Test']"));
//js.executeScript("arguments[0].click();",test1);
driver.get("https://prexahotfix.crm3.dynamics.com/main.aspx?appid=5984134a-1d98-ee11-be37-000d3ae868a5&pagetype=entitylist&etn=account&viewid=00000000-0000-0000-00aa-000010001001&viewType=1039");
driver.findElement(By.xpath("//span[text()='New Customer']")).click();

String name1="Automation Engineer";		//Used during Assertions mainly
String type1="Customer";
String phone1="8888855555";
String email1= "orion@arm.com";
String btype1= "COD";
String binterval1= "Anniversary"; 
String pterms1="Net 45"; 
String sno1="866";
String add1="Choose any random abc"; 

driver.findElement(By.xpath("//input[@aria-label='Name']")).sendKeys(name1);
driver.findElement(By.xpath("//input[@aria-label='Primary Phone']")).sendKeys(phone1);
driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys(email1);

driver.findElement(By.xpath("//button[@aria-label='Billing Interval']")).click();
driver.findElement(By.xpath("//div[text()='Anniversary']")).click();
driver.findElement(By.xpath("//button[@aria-label='Billing Type']")).click();
driver.findElement(By.xpath("//div[text()='COD - Pre Paid']")).click();

driver.findElement(By.xpath("//button[@aria-label='Payment Terms']")).click();
driver.findElement(By.xpath("//div[text()='Net 45']")).click();

driver.findElement(By.xpath("//input[@aria-label='Suite No.']")).sendKeys(sno1);
driver.findElement(By.xpath("//textarea[@aria-label='Address input']")).sendKeys(add1);
driver.findElement(By.xpath("//button[@aria-label ='Save (CTRL+S)']")).click();
driver.findElement(By.xpath("//button[@title='Ignore and save']")).click();

String nametx1 = driver.findElement(By.xpath("//input[@aria-label='Name']")).getAttribute("value");
System.out.println("nametx1= "+nametx1);

if(nametx1.equals(name1))
{
System.out.println("Sysout1 names matching"+name1+","+nametx1);
Reporter.log("Rlog1 names matching: nametx1= "+nametx1+", name1= "+name1, true);
}
else
{
	Assert.assertEquals(nametx1, name1,"Msg1 if Names not matching");
}

Thread.sleep(5000);
driver.quit();

}
}
