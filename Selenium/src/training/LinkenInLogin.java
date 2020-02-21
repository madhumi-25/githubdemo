package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkenInLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.get("https://www.linkedin.com/");
		
//		Sign in
//	driver.findElement(By.className("nav__button-secondary")).click();

//		email id
//		driver.findElement(By.id("username")).sendKeys("madhusavi1@gmail.com");	

//		password
//		driver.findElement(By.id("password")).sendKeys("madhus77");	

//		signin and details
//		driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();	//absolute xpath(copy full path)
//		driver.close(); //current tab will be closed
//		driver.quit(); //all tabs will be closed
		
//		Join now
//		driver.findElement(By.linkText("Join now")).click(); 
		//or
//		driver.findElement(By.partialLinkText("Join")).click();
		
//		post a job
		driver.findElement(By.xpath("/html/body/main/section[3]/div/a")).click();
		//(or)
//		driver.findElement(By.xpath("//*[@ class='pill pill--talent-finder-cta']")).click();
//		or
//		driver.findElement(By.xpath("//*[@ data-tracking-control-name='homepage-basic_talent-finder-cta'and @class='pill pill--talent-finder-cta']")).click();
//		driver.findElement(By.xpath("//*[@ id='first-name-ember18'and @data-test-form-input='firstName']")).sendKeys("Madhu");
//		driver.findElement(By.xpath("//*[contains(@id,'username')]")).sendKeys("madhu@gmail.com");

//		anywords it will accept within id name
//		driver.findElement(By.xpath("//*[contains(@id,'name-ember18')]")).sendKeys("madhu@gmail.com"); 

//		it accept and displays only when we give starting word
//		driver.findElement(By.xpath("//*[starts-with(@id,'first-')]")).sendKeys("madhu@gmail.com"); 

		
		
	}
}
