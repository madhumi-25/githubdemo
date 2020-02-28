package Main_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mainlogin 
{
	WebDriver driver;
	WebElement textbox;
	public void launchurl() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
	}
	public void click_signin()
	{
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	}
	public void login_email_pass()
	{
		driver.findElement(By.id("username")).sendKeys("madhusavi1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("madhus77");
	}
	public void signin_button() throws InterruptedException
	{
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
	}
}
