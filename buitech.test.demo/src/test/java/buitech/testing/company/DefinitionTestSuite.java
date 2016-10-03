package buitech.testing.company;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/buitechNavigation/buitechNavigation.feature")
public class DefinitionTestSuite {}
