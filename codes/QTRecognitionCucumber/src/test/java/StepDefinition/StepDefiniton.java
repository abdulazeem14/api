package StepDefinition;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.Hompage;
import resources.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.junit.runner.RunWith;

public class StepDefiniton extends Base{

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    		wd=initializeDriver();
    }

    @When("^User enters (.+) and (.+) and LogIn$")
    public void user_enters_something_and_something_and_login(String username, String password) throws Throwable {
    	wd.get(prop.getProperty("url"));
		Hompage hp=new Hompage(wd);
		hp.username().sendKeys(username);
		hp.password().sendKeys(password);
		hp.signin().click();
	

    }

    @Then("^verify the Title of webPage $")
    public void verify_the_title_of_webpage() throws Throwable {
       System.out.println(wd.getTitle());
    }

    @Then("^Close the Browser$")
    public void close_the_browser() throws Throwable {
        wd.close();
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
       wd.get(prop.getProperty("url"));
    }

}