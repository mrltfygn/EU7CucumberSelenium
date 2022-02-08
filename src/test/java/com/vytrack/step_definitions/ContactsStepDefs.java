package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        // go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username=null;
        String password=null;

        if(userType.equals("driver")){
            username=ConfigurationReader.get("driver_username");
            password=ConfigurationReader.get("driver_password");
        }
        else if (userType.equals("sales manager")){
            username=ConfigurationReader.get("sales_manager_username");
            password=ConfigurationReader.get("sales_manager_password");
        }
        else if(userType.equals("store manager")){
            username=ConfigurationReader.get("store_manager_username");
            password=ConfigurationReader.get("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert the to list of string and assert
        List<String> actualOptions= BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);
    }
    @When("the user logs is using following credentials")
    public void the_user_logs_is_using_following_credentials(Map<String,String> userInfo) {
        System.out.println(userInfo);
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
        String actualName=new DashboardPage().getUserName();
        String expectedName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
        Assert.assertEquals(expectedName,actualName);


    }


}
