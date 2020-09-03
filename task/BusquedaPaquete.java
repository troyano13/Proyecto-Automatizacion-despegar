package com.tata.certificacion.despegar.task;

import java.util.List;

import com.tata.certificacion.despegar.iteractions.SelecionarDia;
import com.tata.certificacion.despegar.models.UsuarioViaje;
import com.tata.certificacion.despegar.userInterfaz.DespegarHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BusquedaPaquete implements Task {

	private UsuarioViaje listaDatos;

	public BusquedaPaquete(List<UsuarioViaje> listaDatos) {
		this.listaDatos = listaDatos.get(0);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(

				Click.on(DespegarHome.VENTANA_INICIO),
				Enter.theValue(listaDatos.getCiudadOrigen()).into(DespegarHome.TXT_ORIGEN1),
				Click.on(DespegarHome.BTN_ORIGEN.of(listaDatos.getCiudadOrigen())),
				Enter.theValue(listaDatos.getCiudadDestino()).into(DespegarHome.TXT_VUELTA),
				Click.on(DespegarHome.BTN_VUELTA1.of(listaDatos.getCiudadDestino())),
				Click.on(DespegarHome.BNT_ELEGIR_FECHA_CALENDARIO_IDA),
				
				SelecionarDia.inCalendario(DespegarHome.FECHA_ORIGEN_BUSQUEDA_ACTIVA, DespegarHome.BTN_NEXT_FECHA,
						listaDatos.getFechaInicio(), listaDatos.getDiaInicio()),
				
				SelecionarDia.inCalendario(
						DespegarHome.FECHA_ORIGEN_BUSQUEDA_ACTIVA, DespegarHome.BTN_NEXT_FECHA,
						listaDatos.getFechaFin(), listaDatos.getDiaFin()));

		

	}

	public static BusquedaPaquete elegirPaquete(List<UsuarioViaje> listaDatos) {
		return Tasks.instrumented(BusquedaPaquete.class, listaDatos);
	}

}
