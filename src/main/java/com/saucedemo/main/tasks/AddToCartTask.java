package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCartTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.BTN_ADD_ITEM_TSHIRTRED)
        );
    }

    public static AddToCartTask addItem(){
        return instrumented(AddToCartTask.class);
    }
}
