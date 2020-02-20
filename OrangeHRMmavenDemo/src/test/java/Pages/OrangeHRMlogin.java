package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMlogin 
{
	WebDriver driver;
	By username= By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginbutton=By.xpath("//*[@id=\"btnLogin\"]");
	public OrangeHRMlogin(WebDriver driver)
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
}
