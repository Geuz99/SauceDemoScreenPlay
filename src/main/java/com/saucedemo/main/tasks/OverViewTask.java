package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.OverviewUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OverViewTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OverviewUI.BTN_FINISH)
        );
    }

    public static OverViewTask finishCheck(){
        return instrumented(OverViewTask.class);
    }
}
