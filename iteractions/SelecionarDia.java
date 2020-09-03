package com.tata.certificacion.despegar.iteractions;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

import com.tata.certificacion.despegar.userInterfaz.DespegarHome;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelecionarDia implements Interaction {

	private Target target;
	private Target btnNext;
	private String mes;
	private String dia;

	public SelecionarDia(Target target, Target btnNext, String mes, String dia) {
		this.target = target;
		this.btnNext = btnNext;
		this.mes = mes;
		this.dia = dia;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElementFacade elementoTraido = target.resolveFor(actor);
		String fechaTraida = elementoTraido.getAttribute("data-month");

		while (!fechaTraida.equals(mes)) {
			actor.attemptsTo(Click.on(btnNext));
			fechaTraida = target.resolveFor(actor).getAttribute("data-month");
		}
		DespegarHome.SELECCIONAR_DIA.of(dia).resolveFor(actor).isVisible();
		
		actor.attemptsTo(Click.on(DespegarHome.SELECCIONAR_DIA.of(dia)));
		System.out.println("dio click en el dia"+ dia);
		
	}

	public static SelecionarDia inCalendario(Target target, Target btnNext, String mes, String dia) {
		return Tasks.instrumented(SelecionarDia.class, target, btnNext, mes, dia);
	}
}
