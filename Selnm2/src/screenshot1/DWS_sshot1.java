package screenshot1;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import a_generics.Sshot_generic1;

public class DWS_sshot1 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
	try
	{
	driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
	}
	catch (Exception e) 
	{
			Sshot_generic1.ssgeneric(driver);
			System.out.println("11111");
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	}
	
	
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	try
	{
	driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
	}
	catch (Exception e) 
	{
			Sshot_generic1.ssgeneric(driver);
			String text2 = driver.findElement(By.className("product-name")).getText();
			System.out.println(text2);
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			System.out.println("22222");
			String text22=driver.findElement(By.partialLinkText(text2)).getText();
			System.out.println(text22);
			
			if(text2.contains(text22))
			{
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
			}
	}
	
	Thread.sleep(4000);
	driver.close();	
	
}
}
