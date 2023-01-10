package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutUI {

    public static final Target TEXT_VALID = Target.the("Texto de CHECKOUT").locatedBy("//span[@class='title']");

    public static final Target FIRSTNAME_CHECKOUT = Target.the("Nombre en el checkout").locatedBy("//input[@id='first-name']");

    public static final Target LASTNAME_CHECKOUT = Target.the("Apellido en el checkout").locatedBy("//input[@id='last-name']");

    public static final Target ZIP_CHECKOUT = Target.the("Codigo zip en el checkout").locatedBy("//input[@id='postal-code']");

    public static final Target BTN_CONTINUE = Target.the("Boton continuar").locatedBy("//input[@id='continue']");

}
