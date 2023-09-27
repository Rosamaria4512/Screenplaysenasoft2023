package co.com.Senasoft.StepsDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.Senasoft.StepsDefinitions",
        strict = false,
        plugin = "pretty",
        tags = "@incompletelogin"
)
public class CarRentalStepDefinition {
}
