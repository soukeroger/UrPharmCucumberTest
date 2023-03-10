package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features= {".//Features//"},
        glue= "stepDefinitions",
        plugin= {
                "pretty", "html:reports/myreport.html",
                "json:reports/myreport.json"
        },    //Mandatory to capture failures
        dryRun=false,
        monochrome=true,
        tags = "@pharmacy"	//Scenarios tagged with @sanity,
)

public class TestRunner {


}
