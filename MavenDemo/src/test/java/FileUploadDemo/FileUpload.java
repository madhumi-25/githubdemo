package FileUploadDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload 
{
	@Test
	public void file() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.ilovepdf.com/");
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/a/h3")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/a/span")).sendKeys("C:/Users/BLTuser.BLT1216/Downloads/key_ans.docx");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).sendKeys("C:/Users/BLTuser.BLT1216/Downloads/key_ans.docx");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/textarea")).sendKeys("File Uploaded");
	}
	
}
