package is.serenity.demo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/login.feature",
tags = "@Case1",
glue = "is.serenity.demo.stepdefinitions",
snippets = SnippetType.CAMELCASE )
public class LoginUserRunner {
}
