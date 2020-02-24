package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public void ExcelLogin() throws IOException
	{
		FileInputStream file=new FileInputStream("C:/Users/BLTuser.BLT1216/Desktop/excel/excelSe.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("testdata");
		int count= sheet.getLastRowNum();
		System.out.println(count);
		for(int i=1;i<=count;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell= row.getCell(0);
			String un= cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
			String pwd= cell1.getStringCellValue();
			
			System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			driver.manage().window().maximize();
			driver.findElement(By.className("nav__button-secondary")).click();
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
			driver.close();	
		}
	}
}
