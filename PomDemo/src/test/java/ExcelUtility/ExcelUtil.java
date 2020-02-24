package ExcelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LinkedInLoginPage;

public class ExcelUtil 
{
	@BeforeClass
	public void StartUp()
	{
		LaunchApp("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	@Test
	public void util() throws IOException
	{
		LinkedInLoginPage lpage= new LinkedInLoginPage(driver);
		lpage.ExcelLogin();
	}
	@AfterClass
	public void Close()
	{
	quit();
	}
}
