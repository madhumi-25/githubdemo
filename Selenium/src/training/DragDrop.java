package training;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DragDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();	
		Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement a= driver.findElement(By.id("draggable"));
		WebElement b= driver.findElement(By.id("droppable"));
		
		Actions c= new Actions(driver);
		c.dragAndDrop(a, b).perform();

	}

}
