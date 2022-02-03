package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void SetUp(){
        System.out.println("\tthis is coming from Before");
    }

    @After
    public void tearDown(){
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
