package Seleniumdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ExcelLogin 
{
@Test
public void excel() throws IOException
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
