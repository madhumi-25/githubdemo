package Stepdefinition;

import Main_class.mainlogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class steplogin 
{
mainlogin lo =new mainlogin();
@Given("^Open Linkedin website page$")
public void open_Linkedin_website_page()  
{
   lo.launchurl();
}
@Then("^click signin button$")
public void click_signin_button() 
{
   lo.click_signin();
}
@Then("^enter email and password det$")
public void enter_email_and_password_det()
{
  lo.login_email_pass();
}
@Then("^Click the signin button$")
public void click_the_signin_button() throws InterruptedException  
{
   lo.signin_button();
}
}
