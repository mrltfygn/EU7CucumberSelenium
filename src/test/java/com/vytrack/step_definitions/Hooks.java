package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void SetUp(){
        System.out.println("\tthis is coming from Before");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();

    }

    @Before("@db")
    public void SetUpdb(){
        System.out.println("\t\tconnection database....");
    }

    @After("@db")
    public void tearDowndb(){
        System.out.println("\t\tdisconnection database...");
    }
}
