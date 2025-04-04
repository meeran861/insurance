package in.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "C:\\Users\\srika\\eclipse-workspace\\InsuranceCompany\\src\\test\\resources\\features",
                   glue = {"in.stepdefinition","in.hooks"},
                   dryRun = false,
                   monochrome = true,
                   plugin = {"html:target/NIC/report.html","json:target/NIC/report.json"}
                   )
public class TestRunner {

}
