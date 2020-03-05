package com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainjava2 
{
	WebDriver driver;
	WebElement cucumber;

	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void homepage() {
		driver.get("https://www.guru99.com/");

	}

	public void cucumber() {
		cucumber = driver.findElement(By.xpath("//*[@id=\'java_technologies\']/li[5]/a"));
		cucumber.click();
		System.out.println("Selected cucumber testing tutorial");
	}

	public void tutorial() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
}