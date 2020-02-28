package Stepdefinition;

import Main_class.mainregister;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepregister {
	mainregister re=new mainregister();
	@Given("^Open linkedin home page$")
	public void open_linkedin_home_page() 
	{
	re.url();
	}
	@Then("^Click join now button$")
	public void click_join_now_button() 
	{
	    re.join_now_click();
	}
	@Then("^Enter email and password$")
	public void enter_email_and_password()  
	{
	   re.email_pass();
	}
	@Then("^Click Agree and continue button$")
	public void click_Agree_and_continue_button() throws InterruptedException 
	{
	    re.agree();
	}
	
}
