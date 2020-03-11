package Seleniumdemo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository
{
		public static void main(String[] args) throws IOException 
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fap%2Fcnep%3Fie%3DUTF8%26orig_return_to%3Dhttps%253A%252F%252Fwww.amazon.in%252Fyour-account%26openid.assoc_handle%3Dinflex%26pageId%3Dinflex&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&ie=UTF8&ignoreAuthState=1&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&fromAuthPrompt=1");
			driver.manage().window().maximize();
			//load the properties file
			Properties obj = new Properties();
			FileInputStream objfile = new FileInputStream("C:\\Users\\BLTuser.BLT1216\\git\\githubdemo\\MavenDemo\\src\\test\\resources\\configuration\\config.property"); //path of the file 
			obj.load(objfile);
			
			//enter data into form
			driver.findElement(By.id(obj.getProperty("username"))).sendKeys("madhumi1998@gmail.com");
			driver.findElement(By.id(obj.getProperty("continue_click"))).click();
			driver.findElement(By.id(obj.getProperty("password"))).sendKeys("savita77");
			driver.findElement(By.id(obj.getProperty("login_click"))).click();
		}
}
