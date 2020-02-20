package com.neoris.screenplay.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://desa30-qa.bbvafrances.com.ar/fnetcore/init.html")
public class InicioSesionPage extends PageObject {


    public static final Target DNI = Target.the("DNI field").located(By.id("documentNumberInput"));
    public static final Target NOMBRE_USUARIO = Target.the("Username field").located(By.id("digitalUser"));
    public static final Target CONTRASENA = Target.the("Password field").located(By.id("digitalKey"));
    public static final Target INGRESAR = Target.the("Sign in").located(By.className("primary-button"));

}