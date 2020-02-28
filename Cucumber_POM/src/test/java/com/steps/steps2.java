package com.steps;

import com.main_java.mainjava2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps2 
{
	mainjava2 guru = new mainjava2();

		@Given("^the user launched the chrome browser$")
		public void the_user_launched_the_chrome_browser() {
			
			guru.launchUrl();
		}

		@When("^the user opens guru(\\d+) homepage$")
		public void the_user_opens_guru_homepage(int arg1) {
			
			guru.homepage();
		}

		@When("^selects cucumber testing from testing list$")
		public void selects_cucumber_testing_from_testing_list() {
			guru.cucumber();
		}

		@Then("^the user should navigate to cucumber tutorial$")
		public void the_user_should_navigate_to_cucumber_tutorial() throws InterruptedException {
			guru.tutorial();	

		}

	}

