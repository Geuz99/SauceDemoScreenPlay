package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CompleteUI {

    public static final Target TEXT_VALID = Target.the("Texto de COMPLETE").locatedBy("//span[@class='title']");

    public static final Target BTN_BACKHOME = Target.the("Boton back home").locatedBy("//button[@id='back-to-products']");


}
