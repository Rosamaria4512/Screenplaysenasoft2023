package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.questions.VerifyBookFailed;
import com.co.qvision.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
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

    @When("^he clicks on the Accommodations option$")
    public void heClicksOnTheAccommodationsOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodationTasks.searchAccommodationTasks());

    }

    @When("^the search and select one of the results$")
    public void theSearchAndSelectOneOfTheResults() {
    OnStage.theActorInTheSpotlight().attemptsTo(AccommodationTask.accommodationTask());
    }


    @Then("^he will have reserved a place of accommodation$")
    public void heWillHaveReservedAPlaceOfAccommodation() {

    }
    //----------------------------------------------------------------------------------------------------------------


    //----Los siguientes pasos o acciones son aquellas que fueron diseñadas para crear una prueba orientada a la falla,
    //es decir que cuando no se ingrese los datos completos, aqui validemos que aparece un mensaje

    @When("^he clicks on the \"([^\"]*)\" option and writes the incomplete specifications$")
    public void heClicksOnTheOptionAndWritesTheIncompleteSpecifications(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(AccommodationFailedTask.accommodationFailedTask());
    }

    @Then("^he will see an incomplete field message$")
    public void heWillSeeAnIncompleteFieldMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBookFailed.verifyBookFailed(), Matchers.equalTo(Boolean.TRUE)));

    }
    //----------------------------------------------------------------------------------------------------------------------------------------------
    @When("^the is in the Results module and select several filters$")
    public void theIsInTheResultsModuleAndSelectSeveralFilters() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodationTasks.searchAccommodationTasks());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(SearchByFiltersTask.searchByFiltersTask());
        OnStage.theActorInTheSpotlight().attemptsTo(AddFavoritesTask.addFavoritesTask());
        Thread.sleep(99000);
    }


    @Then("^He will see the new results obtained by applying the filters$")
    public void heWillSeeTheNewResultsObtainedByApplyingTheFilters() {

    }
}
