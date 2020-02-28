package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerregister 
{
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/resources/Features/testscenario.feature",
			plugin = {"pretty", "html:reports/cucumber-html-report"},
			tags = {"@testcase1register"},
			glue = {"Stepdefinition"},
			monochrome = true
			)

	public class register
	{
		
	}
}
