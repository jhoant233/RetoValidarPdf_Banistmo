package com.grupobancolombia.validar.informe.qa.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectoresValidarInforme extends PageObject{

	public static final Target OPCION_EMPRESAS = Target.the("Opci�n Empresas").
			located(By.xpath("//a[@href='/wps/portal/banistmo/empresas/']"));
	public static final Target OPCION_CAPITAL_INTELIGENTE = Target.the("Ingresar a la opci�n Capital Inteligente").
			located(By.xpath("//a[@href='https:///wps/portal/banistmo/pymes/productos-y-servicios/adquirencia/mpos']"));
	public static final Target OPCION_ACTUALIDAD_ECONOMICA = Target.the("Seleccionar la opci�n Actualidad econ�mica").
			located(By.xpath(""));
	public static final Target OPCION_EVOLUCION_CONTEXTO_MACROECONOMICO = Target.the("Seleccionar el reporte Evoluci�n del contexto macroecon�mico y global al inicio de 2021").
			located(By.xpath(""));
	public static final Target OPCION_REPORTE_OPEP = Target.the("Seleccionar el reporte OPEP+ aumentar� la oferta de petr�leo en julio de 2021").
			located(By.xpath(""));
	public static final Target OPCION_DESCARGAR_INFORME_COMPLETO = Target.the("Descargar el informe OPEP completo").
			located(By.xpath(""));
		

}
