package Grid_Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 
{
WebDriver driver;
String baseurl,nodeurl;
@BeforeTest
public void setup() throws MalformedURLException
{
	baseurl="https://www.linkedin.com/";
	nodeurl="http:/192.168.1.215:5566/wd/hub";// i am node
	DesiredCapabilities capability= DesiredCapabilities.chrome();
	capability.setBrowserName("chrome");
	capability.setPlatform(Platform.WINDOWS);
	driver = new RemoteWebDriver(new URL(nodeurl),capability);
}

@AfterTest
public void aftertest()
{
	driver.quit();
}

@Test
public void simpletest()
{
	driver.get(baseurl);
	String a= driver.getTitle();
	System.out.println("Title of the page");
}
}
