package Seleniumdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScrollDownUp
{

		    WebDriver driver;
		    @Test
		    public void ByPixel() 
		    {
		        System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		        driver = new ChromeDriver();

		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Launch the application		
		        driver.get("https://en.wikipedia.org/wiki/Software_testing");

		        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
		        driver.manage().window().maximize();

		        // This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,10000)");
		        
		        //public void scroll()
		        //{
		        // JavascriptExecutor js=(JavascriptExecutor) driver;
		        //js.executeScript("window.scrollBy(0,500)");
		    }
	}