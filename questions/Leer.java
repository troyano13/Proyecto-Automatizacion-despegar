package com.tata.certificacion.despegar.questions;

import com.tata.certificacion.despegar.userInterfaz.DespegarHome;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Leer implements Question<String> {

	// WebElement=WebElement;texto_traido=new WebElement();
	String mesActual;

	@Override
	public String answeredBy(Actor actor) {
		// return Text.of(GoogleHome.TXT_TRADUCIDO).viewedBy(actor).asString();
		mesActual = "";//Text.of(DespegarHome.BNT_ELEGIR_FECHA_CALENDARIO).viewedBy(actor).asString();
		System.out.println("esto es lo que trae defcha origen" + mesActual);
		
			return mesActual;

	}

	public static Leer traduccion() {
		return new Leer();
	}

}
