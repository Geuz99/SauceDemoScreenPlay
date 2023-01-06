package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final String usuario;
    private final String contrasenia;

    public LoginTask(String usuario, String contrasenia){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginUI.INPUT_USER_NAME),
                Enter.theValue(contrasenia).into(LoginUI.INPUT_PASSWORD),
                Click.on(LoginUI.BUTTON_LOGIN)
        );
    }

    public static LoginTask Login(String usuario, String contrasenia) {
        return instrumented(LoginTask.class,usuario,contrasenia);
    }

}
