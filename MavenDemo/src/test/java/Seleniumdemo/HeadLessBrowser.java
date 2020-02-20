package Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessBrowser 
{
@Test
public void login()
{
	WebDriver driver = new HtmlUnitDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println("The page title is "+title);
	driver.quit();
}
}
