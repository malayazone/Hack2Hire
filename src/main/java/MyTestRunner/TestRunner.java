package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features = "src//test//java//Features", //the path of the feature files
		glue={"src//test//java//StepDefinitions"}, //the path of the step definition files
		//format= {"pretty","html:test-outout", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
		//tags = {"@Smoke"}
		)


public class TestRunner {

}

   //OR Condition : {"@SmokeTest, @End2End"} - Execute Scenario which have any of mentioned Tag
   // AND Condition: {"@SmokeTest", "@End2End"} - Execute Scenario if and if Scenario have all mentioned tags