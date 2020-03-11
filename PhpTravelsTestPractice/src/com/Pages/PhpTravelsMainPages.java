package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhpTravelsMainPages 
{
	WebDriver driver;
	
	By dropdowncurrency= By.id("dropdownCurrency");
	By usd= By.linkText("USD");
	By offers= By.xpath("/html/body/div[2]/div[1]/div[3]/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/a");
	By summervacation= By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div/div[2]/div/div/div[7]/div/div[2]/div/div[3]/div/div/a");
	By name= By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[1]/input");
	By phoneno= By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[2]/input");
	By message= By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[4]/textarea");
	By contact= By.xpath("/html/body/div[2]/div[1]/div[3]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[6]/input[3]");
	By thanks= By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div[1]");
	
	public PhpTravelsMainPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickoperations()
	{
		driver.findElement(dropdowncurrency).click();
		driver.findElement(usd).click();
		driver.findElement(offers).click();
		driver.findElement(summervacation).click();
		driver.findElement(name).sendKeys("Madhumitha");
		driver.findElement(phoneno).sendKeys("9087654321");
		driver.findElement(message).sendKeys("Enjoy Trip");
		driver.findElement(contact).click();
	}
	public String assertfunc()
	{
		String a= driver.findElement(thanks).getText();
		System.out.println(a);
		return a;
	}
	
}
