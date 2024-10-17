package a_generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass_chrome implements Base_constants
{

public WebDriver driver;

@BeforeMethod
public void Openapp()
{
System.setProperty(Chromekey, Chromevalue);
driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get(url);
WebDriverWait w= new WebDriverWait(driver, 15);
driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
}

@AfterMethod
public void Closeapp() throws InterruptedException
{
	Thread.sleep(5000);
	driver.close();
}

}
