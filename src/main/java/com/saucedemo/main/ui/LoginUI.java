package com.saucedemo.main.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INPUT_USER_NAME = Target.the("Ingrese usuario").locatedBy("//input[@id='user-name']");
    public static final Target INPUT_PASSWORD = Target.the("Ingrese contrasenia").locatedBy("//input[@id='password']");
    public static final Target BUTTON_LOGIN = Target.the("Boton login").locatedBy("//input[@id='login-button']");


}
