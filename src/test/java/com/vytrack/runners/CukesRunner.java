package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue ="com.vytrack.step_definitions",
        dryRun = false,
        //  tags = "@smoke" //when we write any one of this tags , only written tags will run
        // tags = "@VYT-123 and @smoke"         => Run all scenarios that has @VYT-123 and @smoke
        // tags = {"@VYT-123","@smoke"}         => Run all scenarios that has @VYT-123 and @smoke (old syntax)

        // tags = "@VYT-123 or @smoke"          => Run all scenarios that has @VYT-123 or @smoke
        // tags = "@VYT-123 , @smoke"           => Run all scenarios that has @VYT-123 or @smoke (old syntax)

        // tags = "@VYT-123 and not @smoke"     => Run all scenarios that has @VYT-123 but skip @smoke tags
        // tags = {"@VYT-123","~@smoke"}        =>Run all scenarios that has @VYT-123 but skip @smoke tags (old syntax)

        tags = "@navigate"

)
public class CukesRunner {
}
