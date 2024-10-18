package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber.json" }, features = "src/test/resources/features", // path to your feature files
		glue = "StepDefinition", // package where step definitions are located
		dryRun = false, // set to true if you want to check if step definitions are missing
		tags = "@Login" // you can use tags to include/exclude specific scenarios
)
public class LoginTestRunner {
}