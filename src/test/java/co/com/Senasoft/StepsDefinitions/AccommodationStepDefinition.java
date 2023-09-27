package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.questions.VerifyBookFailed;
import com.co.qvision.tasks.AccommodationFailedTask;
import com.co.qvision.tasks.AccommodationTask;
import com.co.qvision.tasks.SearchAccommodationTasks;
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


    @When("^he clicks on the \"([^\"]*)\" option$")
    public void heClicksOnTheOption(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAccommodationTasks.searchAccommodationTasks());

    }

    @When("^the search and select one of the results$")
    public void theSearchAndSelectOneOfTheResults() {
    OnStage.theActorInTheSpotlight().attemptsTo(AccommodationTask.accommodationTask());
    }

    @Then("^he will have reserved a place of accommodation$")
    public void heWillHaveReservedAPlaceOfAccommodation() {

    }


    //----Los siguientes pasos o acciones son aquellas que fueron diseñadas para crear una prueba orientada a la falla,
    //es decir que cuando no se ingrese los datos completos, aqui validemos que aparece un mensaje

    @When("^he clicks on the \"([^\"]*)\" option and writes the incomplete specifications$")
    public void heClicksOnTheOptionAndWritesTheIncompleteSpecifications(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(AccommodationFailedTask.accommodationFailedTask());
    }


    @Then("^el vera un mensaje de campo incompleto$")
    public void elVeraUnMensajeDeCampoIncompleto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBookFailed.verifyBookFailed(), Matchers.equalTo(Boolean.TRUE)));

    }
}
