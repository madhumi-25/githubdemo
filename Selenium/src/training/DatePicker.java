package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
//		maximize window		
		driver.manage().window().maximize();
		
//		onward date selection from calander icon		
//		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click();
//		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[6]")).click();
		
//		return date selection from calander icon		
//		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[4]/div/label")).click();
//		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[1]/td[3]/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[4]/td[6]")).click();
		

		
	}

}
