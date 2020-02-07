package com.neoris.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://sapd-wdd.cooperacionseguros.com.ar:44300/sap/bc/ui2/flp")
public class InicioSesionPage extends PageObject {

    public static final Target NOMBRE_USUARIO_O_CORREO = Target.the("Username or email field")
            .located(By.id("USERNAME_FIELD-inner"));
    public static final Target CONTRASENA = Target.the("Password field").located(By.id("PASSWORD_FIELD-inner"));
    public static final Target INGRESAR = Target.the("Sign in").located(By.id("LOGIN_LINK"));

}