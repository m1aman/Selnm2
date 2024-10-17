package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_aboutus 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	//Method1
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement aboutus = driver.findElement(By.xpath("//a[.='About Us']"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",aboutus);
	js.executeScript("arguments[0].click();",aboutus);
	
	System.out.println("11111");
	Thread.sleep(5000);
	
	//Method2
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	while(true) //infinite loop
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		try // tryblock if 'Aboutus' not found
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='About Us']")).click(); //go to catch upon Exception
			//js.executeScript("arguments[0].click();",ele);
			Thread.sleep(2000);
			break; 
		}
		catch (Exception e) //do nothing whenever exception
		{ }
	}
	
	System.out.println("Loop broken successfully when No Exception is reached.");
	Thread.sleep(2000);
	driver.quit();	
}
}
