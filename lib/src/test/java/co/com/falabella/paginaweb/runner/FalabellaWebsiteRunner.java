package co.com.falabella.paginaweb.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			features = "src/test/resources/features/falabella.feature", 
			glue = "co.com.falabella.paginaweb.stepdefinitions",
			snippets = SnippetType.CAMELCASE
	)
public class FalabellaWebsiteRunner {

}
