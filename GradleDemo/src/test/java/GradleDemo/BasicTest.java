package GradleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest 
{
@Test
public void key()
{
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	driver.manage().window().maximize();
}
}
