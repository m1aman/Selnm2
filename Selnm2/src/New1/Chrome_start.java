package New1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_start 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
//WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
WebDriverWait ewait=new WebDriverWait(driver, 15);
//ewait.until(ExpectedConditions.visibilityOf(null));

Thread.sleep(2000);
driver.quit();
}
}
