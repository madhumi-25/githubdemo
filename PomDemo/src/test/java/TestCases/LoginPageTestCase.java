package TestCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Library.WrapperMethod;
import Pages.LinkedInLoginPage;

public class LoginPageTestCase extends WrapperMethod
{
	@BeforeClass
	public void StartUp()
	{
		LaunchApp("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	@Test
	public void Login()
	{
		LinkedInLoginPage lpage= new LinkedInLoginPage(driver);
		lpage.LoginToAppUsername("madhusavi1@gmail.com");
		lpage.LoginToAppPassword("madhus77");
		lpage.SignInButton();
	}
	@AfterClass
	public void Close()
	{
	quit();
	}
}
