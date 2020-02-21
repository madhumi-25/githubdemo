package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSelect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement a= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement a1= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement a2= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement a3= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		WebElement a4= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		
		Actions e= new Actions(driver);
		e.clickAndHold(a).clickAndHold(a4).release().build().perform();
	}

}
