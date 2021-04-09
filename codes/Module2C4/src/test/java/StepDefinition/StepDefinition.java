package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.Base;

import org.junit.runner.RunWith;

import PageObject.LoginPage;

@RunWith(Cucumber.class)
public class StepDefinition extends Base {

  LoginPage lp=new LoginPage();

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
  
    	lp.wd=initializeWebDriver();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and LogIn$")
    public void user_enters_something_and_something_and_login(String strArg1, String strArg2) throws Throwable {
       lp.email().sendKeys(strArg1);
       lp.password().sendKeys(strArg2);
       lp.Login().click();
    }

    @Then("^verify the Title of webPage $")
    public void verify_the_title_of_webpage() throws Throwable {
        System.out.println(wd.getTitle());
    }

    @Then("^Close the Browser$")
    public void close_the_browser() throws Throwable {
       lp.wd.close();
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
       lp.wd.get(prop.getProperty("url"));
    }

    @And("^Click on  Log In  to Existing Account$")
    public void click_on_log_in_to_existing_account() throws Throwable {
    		
    		lp.loginExistingacnt().click();
    }
}