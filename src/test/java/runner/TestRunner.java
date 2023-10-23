package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\HooksDemo1.feature",
                 glue= {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "timeline:test-output-thread/"
                		 },
                 //tags="@all"
                 //tags="@login"
                 //tags="@login and @logout"
                 //tags="@login or @logout"
                 //tags="not @logout"
                 //tags="@regression or @smoke or @functional"
                 //monochrome = true,
                 tags="@regression"
        )

public class TestRunner {

}
