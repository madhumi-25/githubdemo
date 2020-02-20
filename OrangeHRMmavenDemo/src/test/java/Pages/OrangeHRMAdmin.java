package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMAdmin 
{
	WebDriver driver;
	By username= By.name("txtUsername");
	By password=By.id("txtPassword");
	By loginbutton=By.xpath("//*[@id=\"btnLogin\"]");
	By admin= By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
//	By job=By.xpath("//*[@id=\"menu_admin_Job\"]");
//	By jobtitles=By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]");
	By ceo=By.xpath("//*[@id=\"ohrmList_chkSelectRecord_9\"]");
	By hr=By.xpath("//*[@id=\"ohrmList_chkSelectRecord_3\"]");
	By add=By.xpath("//*[@id=\"btnAdd\"]");
	By title=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/input");
	//By pic=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input");
	By save=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input[1]");

	public OrangeHRMAdmin(WebDriver driver)
	{
		this.driver= driver;
	}
	public void OrangeHRMloginUsername(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	public void OrangeHRMloginPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void OrangeHRMloginButton()
	{
		driver.findElement(loginbutton).click();
	}
	public void OrangeHRMAdminclickadmin()
	{
		driver.findElement(admin).click();
	}
	public void OrangeHRMAdminclickjobandjobtitles() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement job= driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a"));
		Thread.sleep(3000);
		WebElement jobtitles= driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/ul/li[1]/a"));
		Actions c= new Actions(driver);	
		c.moveToElement(job);
		c.moveToElement(jobtitles).click().perform();
		//driver.findElement(job).click();
	}
//	public void OrangeHRMAdminclickjobtitle()
//	{
//		driver.findElement(jobtitles).click();
//	}
	public void OrangeHRMAdmincheckceo() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(ceo).click();
	}
	public void OrangeHRMAdmincheckhr() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(hr).click();
	}
	public void OrangeHRMAdminbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(add).click();
	}
	public void OrangeHRMAdmintit(String ti) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(title).sendKeys(ti);
	}
	public void OrangeHRMAdminsave() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(save).click();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement a= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[1]"));
//	WebElement b= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[3]/a/span"));
//
//	Actions c= new Actions(driver);	
//	c.moveToElement(a);
//	c.moveToElement(b).click().perform();

