package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkedInTestCase
{
	WebDriver driver;
  @Test(priority=1,alwaysRun=true)
  public void Signin() 
  {
	  driver.findElement(By.className("nav__button-secondary")).click();
	  driver.findElement(By.id("username")).sendKeys("madhusavi1@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("madhus77");
	  driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
  }
//  @Test
//  public void SigninOperation()
//  {
//	  driver.findElement(By.className("nav__button-secondary")).click();
//	  driver.findElement(By.id("username")).sendKeys("madhusavi1@gmail.com");
//	  driver.findElement(By.id("password")).sendKeys("madhus77");
//	  driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
//	  driver.findElement(By.xpath("//*[@id=\"notifications-tab-icon\"]")).click();
//  }
  @Test(priority=2)
  public void Postajob()
  {
	  driver.findElement(By.xpath("/html/body/main/section[3]/div/a")).click();
	  driver.findElement(By.xpath("//*[@ id='first-name-ember18'and @data-test-form-input='firstName']")).sendKeys("Madhu");
	  driver.findElement(By.xpath("//*[contains(@id,'name-ember18')]")).sendKeys("madhu@gmail.com");
  }
  @BeforeMethod(description="Launching the App")
  public void beforeMethod() 
  {
	  	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();	
  }
  @AfterMethod(description="Closing the App")
  public void afterMethod() 
  {
	  driver.close();
  }
}
