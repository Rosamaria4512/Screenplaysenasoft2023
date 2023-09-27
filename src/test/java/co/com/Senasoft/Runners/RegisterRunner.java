package co.com.Senasoft.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.Senasoft.stepdefinitions",
        strict = false,
        plugin = "pretty"
)
public class RegisterRunner {
}
