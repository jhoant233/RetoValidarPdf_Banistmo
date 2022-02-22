package com.grupobancolombia.validar.informe.qa.interactions;



import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class EsperarSegundos implements Interaction{
	
	private int segundos;
	
	public EsperarSegundos(int segundos) {
		
		this.segundos = segundos;
	}

	@Override
	public <T extends Actor> void performAs(T arg0) {
		
		try {
			
			Thread.sleep(segundos*1000);
			
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static Performable estosSegundos(int segundos) {
		
		return Instrumented.instanceOf(EsperarSegundos.class).withProperties(segundos);
		
	}

}
