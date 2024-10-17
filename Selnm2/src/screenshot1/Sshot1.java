package screenshot1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sshot1 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	TakesScreenshot t= (TakesScreenshot) driver;
	File img = t.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\PC\\Desktop\\Sshot_selnm\\d1.jpeg");
	FileHandler.copy(img, target);
	
	Thread.sleep(2000);
	driver.close();
}
}
