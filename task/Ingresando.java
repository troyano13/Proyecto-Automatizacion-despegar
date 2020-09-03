package com.tata.certificacion.despegar.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.tata.certificacion.despegar.userInterfaz.DespegarHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresando implements Task{
	private String app;

	public Ingresando(String app) {
		this.app = app;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(DespegarHome.VENTANA_INICIO));
	}

	public static Ingresando enLaApp(String app) {
		return instrumented(Ingresando.class, app);
	}

}
