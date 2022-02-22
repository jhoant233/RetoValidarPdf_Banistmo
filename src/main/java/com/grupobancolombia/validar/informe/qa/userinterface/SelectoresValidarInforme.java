package com.grupobancolombia.validar.informe.qa.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectoresValidarInforme extends PageObject{

	public static final Target OPCION_EMPRESAS = Target.the("Opción Empresas").
			located(By.xpath("//a[@href='/wps/portal/banistmo/empresas/']"));
	public static final Target OPCION_CAPITAL_INTELIGENTE = Target.the("Ingresar a la opción Capital Inteligente").
			located(By.xpath("//a[@href='https:///wps/portal/banistmo/pymes/productos-y-servicios/adquirencia/mpos']"));
	public static final Target OPCION_ACTUALIDAD_ECONOMICA = Target.the("Seleccionar la opción Actualidad económica").
			located(By.xpath(""));
	public static final Target OPCION_EVOLUCION_CONTEXTO_MACROECONOMICO = Target.the("Seleccionar el reporte Evolución del contexto macroeconómico y global al inicio de 2021").
			located(By.xpath(""));
	public static final Target OPCION_REPORTE_OPEP = Target.the("Seleccionar el reporte OPEP+ aumentará la oferta de petróleo en julio de 2021").
			located(By.xpath(""));
	public static final Target OPCION_DESCARGAR_INFORME_COMPLETO = Target.the("Descargar el informe OPEP completo").
			located(By.xpath(""));
		

}
