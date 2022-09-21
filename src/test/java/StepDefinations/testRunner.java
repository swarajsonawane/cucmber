package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features/login.feature",
							glue = {"StepDefinations"},
							monochrome = true,
							plugin = {"pretty","html:target/HTML/Reports.html",
											   "junit:target/XML/Result.xml",
											   "json:target/jsonReports/cucumber-report.json"})
						
public class testRunner {

}
