package TestNGdemo;

import org.testng.annotations.Test;

public class DependsOnGroups 
{
	@Test(groups= {"functional testing","retesting"})
	public void testcase1()
	{
		System.out.println("Testcase 1");
	}
	@Test(groups= {"functional testing","smoke testing"})
	public void testcase2()
	{
		System.out.println("Testcase 2");
	}
	@Test(groups= {"regression testing","smoke testing"})
	public void testcase3()
	{
		System.out.println("Testcase 3");
	}
}
