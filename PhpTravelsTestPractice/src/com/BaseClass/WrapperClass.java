package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass 
{
	protected WebDriver driver;
	
	public void launchapplication(String browser,String url)
	{
		//To Launch the chrome browser
		try
		{
			if(browser.equalsIgnoreCase("firefox"))
				driver= new FirefoxDriver();
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
		}
		//If browser is not able to launch
		catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
	}
	
	//To take Screenshots
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
	
	//To close the browser
	public void quitbrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
