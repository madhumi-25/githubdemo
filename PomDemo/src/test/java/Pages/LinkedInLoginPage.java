package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInLoginPage 
{
	WebDriver driver;
	By emailid= By.id("username");
	By password1= By.id("password");
	By signinbutton= By.xpath("/html/body/div/main/div/form/div[3]/button");
	public LinkedInLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void LoginToAppUsername(String userid)
	{
		driver.findElement(emailid).sendKeys(userid);
	}
	public void LoginToAppPassword(String pass)
	{
		driver.findElement(password1).sendKeys(pass);
	}
	public void SignInButton()
	{
		driver.findElement(signinbutton).click();
	}
}
