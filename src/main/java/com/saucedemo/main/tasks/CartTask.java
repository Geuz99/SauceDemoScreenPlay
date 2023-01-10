package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.BTN_CART)
        );
    }

    public static CartTask OpenCart(){
        return instrumented(CartTask.class);
    }
}
