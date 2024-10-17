package chromefox_start1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox_start 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait ewait=new WebDriverWait(driver, 15);
	ewait.until(ExpectedConditions.visibilityOf(null));
	
	Thread.sleep(2000);
	driver.quit();
}
}
