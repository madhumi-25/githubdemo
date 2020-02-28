package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerlogin 
{
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/resources/Features/testscenario.feature",
			plugin = {"pretty", "html:reports/cucumber-html-report"},
			tags = {"@testcase2login"},
			glue = {"Stepdefinition"},
			monochrome = true
			)

	public class login
	{
		
	}
}
