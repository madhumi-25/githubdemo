package training;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDownSelect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
//		select from drop down menu
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("27");
//		or		
		day.selectByIndex(27);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jul");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1998");
		
//		radio button normal click copy full xpath		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/form/div[1]/div[6]/span/span[1]/label")).click();
		
	}

}
