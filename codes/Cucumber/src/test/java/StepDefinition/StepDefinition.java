package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^user is on Landing Page$")
    public void user_is_on_landing_page() throws Throwable {
       System.out.println("Navigated to Home Page");
    }

    @When("^user Login to the applicaiton by entering valid \"([^\"]*)\" and \"([^\"]*)\" password$")
    public void user_login_to_the_applicaiton_by_entering_valid_something_and_something_password(String strArg1, String strArg2) throws Throwable {
       System.out.println("Navigated to Home Page");
       System.out.println("username is:"+strArg1);
       System.out.println("password is:"+strArg2);
       
       
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
       System.out.println("Validated the Home Page");
    }

    @And("^username is displayed$")
    public void username_is_displayed() throws Throwable {
        System.out.println("Validate the Username");
    }
    @And("^username is not displayed$")
    public void username_is_not_displayed() throws Throwable {
        System.out.println("Username is not displayed");
    }
}