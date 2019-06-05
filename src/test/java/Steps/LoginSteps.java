package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HeaderPage;

public class LoginSteps {
    private HeaderPage headerPage= new HeaderPage();



@Given("^I am on home page$")
public void i_am_on_home_page() throws Throwable {

}

    @When("^I search for a product$")
    public void i_search_for_a_product() throws Throwable {
    headerPage.dosearch();

    }

    @Then("^I should be able to see respective results$")
    public void i_should_be_able_to_see_respective_results() throws Throwable {
    }
}


