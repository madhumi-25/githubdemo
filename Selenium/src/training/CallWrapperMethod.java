package training;

import java.io.IOException;

public class CallWrapperMethod {

	public static void main(String[] args) throws IOException 
	{
		Wrapper w = new Wrapper();
		w.LaunchApp("https://www.linkedin.com/");
		w.Clickxpath("/html/body/nav/a[3]");
		w.EnterById("username", "madhusavi1@gmail.com");
		w.EnterById("password", "madhus77");
		w.Clickxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		w.Screenshot("C:/Users/BLTuser.BLT1216/Desktop/Selenium/screenshot/snap1.png");
		w.CloseApp();
	}

}
