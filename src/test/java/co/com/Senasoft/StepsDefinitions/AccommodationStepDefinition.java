package co.com.Senasoft.StepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AccommodationStepDefinition {
    @Managed
    WebDriver webDriver;
    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }
    @Given("^the user Enter the website$")
    public void theUserEnterTheWebsite() {
    OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.booking.com/"));

    }


    @When("^he clicks on the \"([^\"]*)\" option$")
    public void heClicksOnTheOption(String arg1) {

    }

    @When("^the search and select one of the results$")
    public void theSearchAndSelectOneOfTheResults() {

    }

    @Then("^he will have reserved a place of accommodation$")
    public void heWillHaveReservedAPlaceOfAccommodation() {

    }
}
