package Orangehrm1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm_ewait 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait ewait=new WebDriverWait(driver, 15);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='company-branding']"));
	ewait.until(ExpectedConditions.visibilityOf(img1));
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Leave']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")).sendKeys("2024-09-02");
	driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).sendKeys("2024-09-06");
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]")).click();
	driver.findElement(By.xpath("//div[text()='CAN - FMLA']")).click();
	
	//System.out.println("11111");
	//Thread.sleep(5000);
	//driver.quit();	
}
}
