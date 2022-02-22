package com.grupobancolombia.validar.informe.qa.tasks;

import com.grupobancolombia.validar.informe.qa.userinterface.OpenPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task{
	
	private OpenPage openPage;
	
    public static AbrirPagina banistmo() {

        return Tasks.instrumented(AbrirPagina.class);
     }

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(openPage));
	}

}
