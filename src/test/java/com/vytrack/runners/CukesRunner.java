package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="com.vytrack.step_definitions",
        dryRun = false,
        tags = "@smoke" //when we write any one of this tags , only written tags will run

)
public class CukesRunner {
}
