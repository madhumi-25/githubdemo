package Seleniumdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitTestCase 
{
@Test
public void testcase1()
{
	System.out.println("TestCase 1");
}
@Test
public void testcase2()
{
	System.out.println("TestCase 2");
}
@Test
public void testcase3()
{
	System.out.println("TestCase 3");
}
@Before
public void beforemethod()
{
	System.out.println("Before Method");
}
@After
public void aftermethod()
{
	System.out.println("After Method");
}
@BeforeClass
public static void beforeclass()
{
	System.out.println("Before Class");
}
@AfterClass
public static void afterclass()
{
	System.out.println("After Class");
}
}
