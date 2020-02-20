package TestNGdemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnSomeMethod 
{
	@Test
	public void Login()
	{
		System.out.println("Login application");
	}
	@Test(dependsOnMethods= {"Login"})
	public void Search()
	{
		System.out.println("Search");
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"Search"})
	public void Logout()
	{
		System.out.println("Logout application");
	}
}
