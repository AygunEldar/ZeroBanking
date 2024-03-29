package com.zeroBank.runnners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        },
        features = "src/test/resources/feature",
        glue = "com/zeroBank/stepdefinitions",
        dryRun =true,
        tags = "@wip"

)



public class CukesRunner {

}
