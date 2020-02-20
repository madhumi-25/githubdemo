package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard 
{
@Test
public void key()
{
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	driver.findElement(By.id("username")).sendKeys("madhusavi1@gmail.com");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys("madhus77").perform();
	// action.sendKeys(Keys.ENTER).perform();
	//or
	action.sendKeys(Keys.RETURN).perform();
}
}
