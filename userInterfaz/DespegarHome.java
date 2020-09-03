
package com.tata.certificacion.despegar.userInterfaz;
import net.serenitybdd.screenplay.targets.Target;

public class DespegarHome {

	public static final Target VENTANA_INICIO = Target.the("ventana anuncio promocional")
			.locatedBy("//span [@class='as-login-close as-login-icon-close-circled']");

	public static final Target TXT_ORIGEN1 = Target.the("escribir origen").locatedBy(
			"//input [@class='input-tag sbox-main-focus sbox-origin sbox-primary sbox-places-first sbox-origin-container places-inline']");

	public static final Target BTN_ORIGEN = Target.the("btn origen")
			.locatedBy("//ul[@class='ac-group-items' and .= '{0}']");

	public static final Target TXT_VUELTA = Target.the("ecribir vuelta ").locatedBy(
			"//input[@class='input-tag sbox-main-focus sbox-destination sbox-secondary sbox-places-second places-inline']");

	public static final Target BTN_VUELTA1 = Target.the("btn destino")
			.locatedBy("//ul[@class='ac-group-items' and .= '{0}']");

	public static final Target BNT_ELEGIR_FECHA_CALENDARIO_IDA = Target.the("Muestra el calendario 1")
			.locatedBy("//input[@type='text'] [@placeholder='Ida']");
	
	public static final Target BNT_ELEGIR_FECHA_CALENDARIO_VUELTA = Target.the("Muestra el calendario 2")
			.locatedBy("//input[@type='text'] [@placeholder='Vuelta']");
	

	public static final Target FECHA_ORIGEN_BUSQUEDA_ACTIVA = Target.the("elegir fecha mes origen")
			.locatedBy("//div[@class='datepicker-packages']//div[ contains(@class,'month-active')]");

	public static final Target BTN_NEXT_FECHA = Target.the("boton calendario proximo").locatedBy(
			"//div[@class='_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show']//div[@class='_dpmg2--controls-next']");

	public static final Target SELECCIONAR_DIA = Target.the("selecionar Dia").locatedBy(
			"(//div[ contains(@class,'month-active')]//span[contains(@class, '_dpmg2--available') and .='{0}'])[3]");

}
