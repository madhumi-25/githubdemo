package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
//		or
//		driver.switchTo().alert().getText();
		a.accept();//clicking ok button
		//a.dismiss();//clicking cancel button
		a.sendKeys("Madhu");// It accept the value Madhu a.accept();
		driver.close();
		
	}

}
