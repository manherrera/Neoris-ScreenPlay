package com.neoris.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
    public static final Target MENU = Target.the("Menu of the Princpal Page").located(By.id("private-submenu"));
}
