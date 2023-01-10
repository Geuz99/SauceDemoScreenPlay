package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewUI {

    public static final Target TEXT_VALID = Target.the("Texto de OVERVIEW").locatedBy("//span[@class='title']");

    public static final Target BTN_FINISH = Target.the("Boton finish").locatedBy("//button[@id='finish']");


}
