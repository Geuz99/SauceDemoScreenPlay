package com.saucedemo.main.tasks;

import com.saucedemo.main.ui.CheckOutUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckOutTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public CheckOutTask(String firstName, String lastName, String codeZip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = codeZip;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(firstName).into(CheckOutUI.FIRSTNAME_CHECKOUT),
                    Enter.theValue(lastName).into(CheckOutUI.LASTNAME_CHECKOUT),
                    Enter.theValue(zipCode).into(CheckOutUI.ZIP_CHECKOUT),
                    Click.on(CheckOutUI.BTN_CONTINUE)
            );
    }

    public static CheckOutTask chekOutInfo(String firstName, String lastName, String codeZip){
        return instrumented(CheckOutTask.class, firstName, lastName, codeZip);
    }
}
