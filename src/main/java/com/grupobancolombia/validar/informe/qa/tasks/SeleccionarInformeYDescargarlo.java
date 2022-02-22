package com.grupobancolombia.validar.informe.qa.tasks;

import com.grupobancolombia.validar.informe.qa.userinterface.SelectoresValidarInforme;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;



public class SeleccionarInformeYDescargarlo implements Task{

	public static SeleccionarInformeYDescargarlo enLaPagina(){
        return Tasks.instrumented(SeleccionarInformeYDescargarlo.class);
    }
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(SelectoresValidarInforme.OPCION_EMPRESAS),
				Scroll.to(SelectoresValidarInforme.OPCION_CAPITAL_INTELIGENTE),
				Click.on(SelectoresValidarInforme.OPCION_CAPITAL_INTELIGENTE),
				Click.on(SelectoresValidarInforme.OPCION_ACTUALIDAD_ECONOMICA),
				Click.on(SelectoresValidarInforme.OPCION_EVOLUCION_CONTEXTO_MACROECONOMICO),
				Click.on(SelectoresValidarInforme.OPCION_REPORTE_OPEP),
				Click.on(SelectoresValidarInforme.OPCION_DESCARGAR_INFORME_COMPLETO));
	}

}
