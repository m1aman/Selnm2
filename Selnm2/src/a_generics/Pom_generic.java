package a_generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_generic extends DDT_generic
{
	@FindBy(name="element")
	private WebElement Element;
	
	public Pom_generic(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Element()
	{
		return Element;
	}
}
