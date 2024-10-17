package jsExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_wishlist 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("HRX Shoes"+Keys.ENTER);
		
		WebElement sort = driver.findElement(By.xpath("//div[text()='Sort by : ']"));
		Actions act=new Actions(driver);
		act.moveToElement(sort).build().perform();
		
		WebElement wnew = driver.findElement(By.xpath("//input[@value='new']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",wnew);
		
		driver.findElement(By.xpath("//img[@title='HRX by Hrithik Roshan Men Mesh Flymesh Running Marking Sports Shoes']")).click();
		System.out.println("11111");
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[3]")));
		System.out.println("22222");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		
		System.out.println("99999");
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
}
