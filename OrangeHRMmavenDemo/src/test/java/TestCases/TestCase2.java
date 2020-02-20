package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.WrapperMethod;
import Pages.OrangeHRMAdmin;

public class TestCase2 
{
	public class TestCase1 extends WrapperMethod
	{
		@BeforeMethod
	public void startup()
	{
		LaunchApp("chrome","https://opensource-demo.orangehrmlive.com/");
	}
		@Test
	public void OrangeHRMAdminpage() throws InterruptedException
	{
		OrangeHRMAdmin ad=new OrangeHRMAdmin(driver);
		ad.OrangeHRMloginUsername("Admin");
		ad.OrangeHRMloginPassword("admin123");
		ad.OrangeHRMloginButton();
		ad.OrangeHRMAdminclickadmin();
		ad.OrangeHRMAdminclickjobandjobtitles();
		ad.OrangeHRMAdmincheckceo();
		ad.OrangeHRMAdmincheckhr();
		ad.OrangeHRMAdminbutton();
		ad.OrangeHRMAdmintit("PAT");
		ad.OrangeHRMAdminsave();
	}
		@AfterMethod
		public void close()
		{
			quit();
		}	
	}
}
