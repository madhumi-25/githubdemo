package demoexercise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CallWrapperPhp {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		PhpWrapperMethod pwm= new PhpWrapperMethod();
		pwm.launchapp("https://phptravels.com/demo/");
		pwm.enterxpath("//*[@id=\"main-menu\"]/ul/li[8]/a");
		//pwm.selectfunc("//*[@id=\"Primary_Navbar-Store\"]/a","");
//		pwm.enterxpath("//*[@id=\"Primary_Navbar-Store\"]/a");
//		pwm.enterxpath("/html/body/section[2]/nav/div/div[2]/ul[1]/li[2]/ul/li[8]/a");
	    pwm.tabb();
		pwm.enterbyxpath("//*[@id=\"inputEmail\"]", "madhu");
		pwm.enterbyid("inputPassword", "madhu725");
//		pwm.enterxpath("//*[@id=\"main-body\"]/div/div/div[1]/div/div[3]/div[1]/form/div[3]/label/input");
//		pwm.enterxpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
//		pwm.enterxpath("//*[@id=\"login\"]");
//		pwm.screenshot("C:/Users/BLTuser.BLT1216/Desktop/Selenium/screenshotdemo/demo1.png");

	}

}
