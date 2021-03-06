package com.grupobancolombia.validar.informe.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\com\\grupobancolombia\\validar\\informe\\qa\\features\\ValidarInforme.feature",
        glue = "com.grupobancolombia.validar.informe.qa.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class ValidarInformeRunner {

}
