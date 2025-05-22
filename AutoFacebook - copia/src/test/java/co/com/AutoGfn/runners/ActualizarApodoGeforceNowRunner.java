package co.com.AutoGfn.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/actualizar_apodo_geforcenow.feature",
        glue = {"co.com.AutoGfn.stepsdefinitions", "co.com.AutoGfn.utils.hooks"},
        snippets = SnippetType.CAMELCASE
)
public class ActualizarApodoGeforceNowRunner {
}
