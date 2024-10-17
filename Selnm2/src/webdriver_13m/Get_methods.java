package webdriver_13m;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_methods 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Software1/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");	//get
	
	System.out.println("---getTitle---");
	String title= driver.getTitle();		//getTitle
	System.out.println(title);

	System.out.println("---getcurrenturl---");
	String url= driver.getCurrentUrl();		//getcurrenturl
	System.out.println(url);

	Thread.sleep(2000);
	driver.close();
}
}
