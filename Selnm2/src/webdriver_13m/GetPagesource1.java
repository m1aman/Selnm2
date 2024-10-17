package webdriver_13m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesource1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");	//get
	
	System.out.println("---getPagesource---");
	String source= driver.getPageSource();	//getpagesource
	System.out.println(source);

	Thread.sleep(2000);
	driver.close();
}
}
