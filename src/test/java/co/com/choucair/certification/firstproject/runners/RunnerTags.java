package co.com.choucair.certification.firstproject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features="src/test/resources/features/demo.feature",
                 tags = "@tag1",
                 glue = "co.com.choucair.certification.firstproject.stepdefinition",
snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}

