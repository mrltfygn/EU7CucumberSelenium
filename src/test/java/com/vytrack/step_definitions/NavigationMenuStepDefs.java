package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("the user navigate to {string} {string}")
    public void theUserNavigateTo(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);

    }

    @Then("default page number should be {int}")
    public void defaultPageNumberShouldBe(Integer expectedPageNumber) {
        BrowserUtils.waitFor(2);
        ContactsPage contactsPage=new ContactsPage();
        Integer actualNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNumber,actualNumber);


    }
}
