package com.saucedemo.main.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenTheBrowser implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    public static OpenTheBrowser on(){
        return instrumented(OpenTheBrowser.class);

    }
}
