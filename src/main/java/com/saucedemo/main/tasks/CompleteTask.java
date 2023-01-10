package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.CompleteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteUI.BTN_BACKHOME)
        );
    }

    public static CompleteTask returnHome(){
        return instrumented(CompleteTask.class);
    }
}
