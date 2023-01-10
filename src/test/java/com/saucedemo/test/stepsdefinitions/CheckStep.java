package com.saucedemo.test.stepsdefinitions;

import com.saucedemo.main.questions.CheckQuestion;
import com.saucedemo.main.tasks.CheckTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CheckStep {

    private Actor geuz;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        geuz = OnStage.theActorCalled("Geuz");
    }

    @When("^El cliente de click al boton de check$")
    public void el_cliente_de_click_al_boton_de_check() {
        geuz.wasAbleTo(CheckTask.checkItems());

    }

    @Then("^Validamos estar en la pagina del checkout \"([^\"]*)\"$")
    public void validamos_estar_en_la_pagina_del_checkout_something(String validText) {
        geuz.should(GivenWhenThen.seeThat(CheckQuestion.CheckSuccessful(validText)));
    }

}
