package com.neoris.screenplay.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.neoris.screenplay.userinterface.MenuPage.DASHBOARD;

public class LaPaginaDeInicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DASHBOARD.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }
}