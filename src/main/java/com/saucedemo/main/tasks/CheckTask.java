package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartUI.BTN_CHECK)
        );
    }
    public static CheckTask checkItems(){
        return instrumented(CheckTask.class);
    }
}
