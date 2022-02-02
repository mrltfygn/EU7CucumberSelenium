package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("The user navigate to Fleets, Vehicles")
    public void the_user_navigate_to_Fleets_Vehicles() {

        System.out.println("the_user_navigate_to_Fleets_Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the_title_should_be_Vehicles");
    }

    @When("The user navigate to Marketing, Campaigns")
    public void the_user_navigate_to_Marketing_Campaigns() {
        System.out.println("the_user_navigate_to_Marketing_Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("the_title_should_be_Campaigns");
    }

    @When("The user navigate to Activities, Calender Events")
    public void the_user_navigate_to_Activities_Calender_Events() {
        System.out.println("the_user_navigate_to_Activities_Calender_Events");
    }

    @Then("the title should be Calenders")
    public void the_title_should_be_Calenders() {
        System.out.println("the_title_should_be_Calenders");
    }

}
