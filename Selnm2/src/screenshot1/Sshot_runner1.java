package screenshot1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import a_generics.Sshot_generic1;

public class Sshot_runner1 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	Sshot_generic1.ssgeneric(driver);
	
	Thread.sleep(2000);
	driver.quit();
	}
}
