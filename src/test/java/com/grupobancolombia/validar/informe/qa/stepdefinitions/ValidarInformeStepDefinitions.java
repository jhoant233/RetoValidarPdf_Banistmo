package com.grupobancolombia.validar.informe.qa.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.grupobancolombia.validar.informe.qa.exceptions.EjecucionFallida;
import com.grupobancolombia.validar.informe.qa.questions.ValidarInforme;
import com.grupobancolombia.validar.informe.qa.tasks.AbrirPagina;
import com.grupobancolombia.validar.informe.qa.tasks.SeleccionarInformeYDescargarlo;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ValidarInformeStepDefinitions {
	
	@Managed(driver = "Chrome")
	private WebDriver suNavegador;
		
	private Actor Johan = Actor.named("Johan");
	
	@Before()
	public void configuracion() {
		
		Johan.can(BrowseTheWeb.with(suNavegador));
		suNavegador.manage().window().maximize();
	}
	
	@Given("^que ingreso a la pagina de banistmo$")
	public void queIngresoALaPaginaDeBanistmo() {
		 Johan.wasAbleTo(AbrirPagina.banistmo());
	}


	@When("^cargo la opcion actualidad economica y descargo el informe OPEP$")
	public void cargoLaOpcionActualidadEconomicaYDescargoElInformeOPEP() throws EjecucionFallida {
		
		try {
		
		Johan.attemptsTo(SeleccionarInformeYDescargarlo.enLaPagina());
		
		}catch (Exception e) {
			
			throw new EjecucionFallida(e);
			
		}
	
	}

	@Then("^valido que el informe es el (.*)$")
	public void validoQueElInformeEsElOPEP(String titulo) {
		Johan.should(seeThat(ValidarInforme.textoDe(titulo)));
	}

}
