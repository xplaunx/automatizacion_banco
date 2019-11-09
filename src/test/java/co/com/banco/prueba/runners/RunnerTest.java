package co.com.banco.prueba.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="co.com.banco.prueba.stepdefinitions"
		)


public class RunnerTest {

}
