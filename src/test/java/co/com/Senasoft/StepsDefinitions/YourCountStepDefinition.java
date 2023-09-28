package co.com.Senasoft.StepsDefinitions;

import com.co.qvision.models.CredentialLoginCorrectly;
import com.co.qvision.questions.VerifyElementDelete;
import com.co.qvision.tasks.*;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class YourCountStepDefinition {
    @When("^the user selects items for favorites$")
    public void theUserSelectsItemsForFavorites(List<CredentialLoginCorrectly> credentialLoginCorrectlyList) {

        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessage.closeMessage());
        OnStage.theActorInTheSpotlight().attemptsTo(OpenLoginTasks.openLoginTasks());

        CredentialLoginCorrectly credentialLoginCorrectly;
        credentialLoginCorrectly = credentialLoginCorrectlyList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(EnterEmailTask.enterEmailTask(credentialLoginCorrectly));
      //  OnStage.theActorInTheSpotlight().attemptsTo(OpenModuleSaveTask.openModuleSaveTask());
        //OnStage.theActorInTheSpotlight().attemptsTo(AddFavoritesTask.addFavoritesTask());


    }


    @Then("^he will see these elements in his profile$")
    public void heWillSeeTheseElementsInHisProfile() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyElementDelete.verifyElementDelete(),Matchers.equalTo(Boolean.TRUE)));


    }
//--------------------------------------------------------------------------------------------------------
    @When("^the User selects the My account_Favorites module and selects the Delete from favorites option$")
    public void theUserSelectsTheMyAccount_FavoritesModuleAndSelectsDeleteFromFavoritesTheOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(CloseMessage.closeMessage());

    }

    @Then("^the element would have been removed$")
    public void theElementWouldHaveBeenRemoved() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyElementDelete.verifyElementDelete(),Matchers.equalTo(Boolean.TRUE)));

    }
}
