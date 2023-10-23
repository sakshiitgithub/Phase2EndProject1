package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\Lessonend.feature",
                 glue= {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "timeline:test-output-thread/"
                		 },
                 tags="@application"
        )

public class LessonendRunner {

}
