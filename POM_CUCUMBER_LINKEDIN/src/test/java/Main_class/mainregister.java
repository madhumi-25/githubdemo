package Main_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mainregister 
{
	WebDriver driver;
	WebElement textbox;
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
	}
	public void join_now_click()
	{
		driver.findElement(By.xpath("/html/body/nav/a[2]")).click();
	}
	public void email_pass()
	{
		driver.findElement(By.xpath("//*[@id=\"email-or-phone\"]")).sendKeys("madhumi1998@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("madhus77");	
	}
	public void agree() throws InterruptedException
	{
		//driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
