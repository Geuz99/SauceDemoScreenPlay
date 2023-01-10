package com.saucedemo.test.stepsdefinitions;

import com.saucedemo.main.questions.FilterQuestion;
import com.saucedemo.main.questions.LoginQuestion;
import com.saucedemo.main.tasks.FilterTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FilterStep {

    private Actor geuz;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        geuz = OnStage.theActorCalled("Geuz");

    }
    @Given("^El cliente tiene que dar click en el boton de filtracion de menor a mayor$")
    public void el_cliente_tiene_que_dar_click_en_el_boton_de_filtracion(){
        geuz.wasAbleTo(FilterTask.Filter());
    }

    @Then("^Validamos que los precios esten ordenados segun su precio \"([^\"]*)\"$")
    public void validamos_que_los_precios_esten_ordenados_segun_su_precio_something(String strArg1){
        geuz.should(GivenWhenThen.seeThat(FilterQuestion.FilterSuccessful(strArg1)));

    }
}
