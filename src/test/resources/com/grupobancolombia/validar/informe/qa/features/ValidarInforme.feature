#Autor: Johan Tamayo

@HU
Feature: Validar que el informe descargado sea el correcto
	Como usuario de la pagina banistmo
	Quiero descargar el informe OPEP
	Para validar que sea el correcto
	
	
	@ValidacionDeInformeExitoso
	Scenario: Validacion de informe
		Given que ingreso a la pagina de banistmo
		When cargo la opcion actualidad economica y descargo el informe OPEP
		Then valido que el informe es el OPEP

