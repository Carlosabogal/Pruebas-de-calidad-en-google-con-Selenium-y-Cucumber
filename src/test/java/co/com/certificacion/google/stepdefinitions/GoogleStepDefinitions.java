package co.com.certificacion.google.stepdefinitions;



import co.com.certificacion.google.models.Category;
import co.com.certificacion.google.questions.ValidateMessageCriteria;
import co.com.certificacion.google.tasks.ClicksOnSearch;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class GoogleStepDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){


        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Carlos");

    }
    @Given("^I am on the google search page$")
    public void iAmOnTheGoogleSearchPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.google.com/"));
    }

    @When("^I enter a search criteria$")
    public void iEnterASearchCriteria(List<Category> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicksOnSearch.click(info));

    }

    @When("^click on the search button$")
    public void clickOnTheSearchButton() {

    }

    @Then("^the results match the (.*)$")
    public void theResultsMatchTheCriteria(String criteria) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageCriteria.message(), Matchers.equalTo(criteria)));

    }


    @Then("^should check the info <Elements>$")
    public void shouldCheckTheInfoElements() {
    }
}
