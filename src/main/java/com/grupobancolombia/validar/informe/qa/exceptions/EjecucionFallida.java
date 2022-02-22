package com.grupobancolombia.validar.informe.qa.exceptions;

public class EjecucionFallida extends Exception{
	
	public static final String ERROR_AL_EJECUTAR_AUTOMATIZACION = "No es posible continuar con la ejecución error:  ";

	public EjecucionFallida ( Exception mensaje) {
		super(ERROR_AL_EJECUTAR_AUTOMATIZACION+mensaje);
	}

}
