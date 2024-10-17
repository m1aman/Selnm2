package Sync1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iwait1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait ewait=new WebDriverWait(driver, 10);
	
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("apple");
	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("mango");
	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);

	ewait.until(ExpectedConditions.titleContains("apple"));
	System.out.println("yes title apple");
	driver.quit();	
}
}
