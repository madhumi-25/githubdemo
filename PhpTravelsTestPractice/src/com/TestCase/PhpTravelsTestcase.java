package com.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.BaseClass.WrapperClass;
import com.Pages.PhpTravelsMainPages;

public class PhpTravelsTestcase extends WrapperClass
{
	@BeforeMethod
	public void launchurl()
	{
		launchapplication("chrome","https://www.phptravels.net/home");
	}
	
	@Test
	public void Testcase() throws IOException
	{
		PhpTravelsMainPages pt=new PhpTravelsMainPages(driver);
		pt.clickoperations();
		String b=pt.assertfunc();
		System.out.println(b);
		Assert.assertEquals("Thanks For Contacting", b);
		screenshot("Screenshots/php.png");
	}
	
	@AfterMethod
	public void close() throws IOException, InterruptedException
	{
		quitbrowser();
	}
}
