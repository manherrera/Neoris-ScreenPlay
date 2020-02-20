package com.neoris.screenplay.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.neoris.screenplay.userinterface.MenuPage.MENU;

@Subject("the home page is visible")
public class LaPaginaDeInicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENU.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible() {
        return new LaPaginaDeInicio();
    }
}