package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider 
{
	WebDriver driver;
@Test(dataProvider = "TestData")
public void login(String username,String password)
{
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.close();
}
@BeforeMethod
public void beforemethod()
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	System.out.println(driver.getTitle());
}
@DataProvider (name="TestData")
public Object[][] getdata()
{
	Object[][] data = new Object[3][2];
	data [0][0] = "userone";
	data [0][1] = "passone";
	data [1][0] = "usertwo";
	data [1][1] = "passtwo";
	data [2][0] = "userthree";
	data [2][1] = "passthree";
	return data;
}
}
