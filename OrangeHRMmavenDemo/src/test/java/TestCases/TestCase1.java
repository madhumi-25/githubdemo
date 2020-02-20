package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.WrapperMethod;
import Pages.OrangeHRMlogin;

public class TestCase1 extends WrapperMethod
{
@BeforeMethod
public void StartUp()
{
	LaunchApp("chrome","https://opensource-demo.orangehrmlive.com/");
}
@Test
public void Login()
{
	OrangeHRMlogin log=new OrangeHRMlogin(driver);
	log.OrangeHRMloginUsername("Admin");
	log.OrangeHRMloginPassword("dgfu");
	log.OrangeHRMloginButton();
}
@AfterMethod
public void Close()
{
	quit();
}
}
