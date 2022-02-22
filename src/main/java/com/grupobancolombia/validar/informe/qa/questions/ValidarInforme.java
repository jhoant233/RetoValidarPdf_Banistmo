package com.grupobancolombia.validar.informe.qa.questions;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;

public class ValidarInforme implements Question<Boolean>{
	
	private String titulo;
	
    public ValidarInforme(String titulo){
        this.titulo = titulo;
    }
    
    public static ValidarInforme textoDe(String titulo){
        return new ValidarInforme(titulo);
    }

	@Override
	public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver driver = BrowsingTheWeb.as(actor).getDriver();
        String url = driver.getCurrentUrl();
        return url.contains(titulo);
		
	}

}
