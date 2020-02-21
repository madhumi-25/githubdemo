package demoexercise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpWrapperMethod 
{
	WebDriver demo;
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		demo=new ChromeDriver();
		demo.get(url);
		demo.manage().window().maximize();
	}
	public void enterxpath(String path)
	{
		demo.findElement(By.xpath(path)).click();
	}
	public void tabb()
	{
		demo.findElement(By.xpath("/html/body")).sendKeys(Keys.CONTROL.TAB);
		}
	public void enterbyid(String loc,String value)
	{
		demo.findElement(By.id(loc)).sendKeys(value);
	}
	public void enterbyxpath(String loc,String value)
	{
		demo.findElement(By.xpath(loc)).sendKeys(value);
	}
	public void screenshot(String snap) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)demo;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File (snap));
	}
//	public void selectfunc(String loc,String text)
//	{
//		Select store=new Select(demo.findElement(By.xpath(loc)));
//		store.selectByVisibleText(text);
//	}


	
	public void closeapp()
	{
		demo.close();
	}
}
