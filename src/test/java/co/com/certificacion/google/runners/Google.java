package co.com.certificacion.google.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\google.feature",
                    glue="co.com.certificacion.google",snippets = SnippetType.CAMELCASE)
public class Google {
}
