package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InternetExplorerLogin 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
	}

}
