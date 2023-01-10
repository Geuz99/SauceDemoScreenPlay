package com.saucedemo.test.stepsdefinitions;

import com.saucedemo.main.questions.CompleteQuestion;
import com.saucedemo.main.questions.OverViewQuestion;
import com.saucedemo.main.tasks.CheckOutTask;
import com.saucedemo.main.tasks.CompleteTask;
import com.saucedemo.main.tasks.OverViewTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CheckOutStep {

    private Actor geuz;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        geuz = OnStage.theActorCalled("Geuz");
    }

    @Given("El cliente ingresa informacion {string} {string} {string}")
    public void elClienteIngresaInformacion(String FirstName, String LastName, String ZipCode) {
        geuz.wasAbleTo(CheckOutTask.chekOutInfo(FirstName, LastName, ZipCode));
    }
    @When("El cliente valida la pagina del checkout {string}")
    public void elClienteValidaLaPaginaDelCheckout(String validText) {
        geuz.should(GivenWhenThen.seeThat(OverViewQuestion.CheckOutSuccessful(validText)));
        geuz.wasAbleTo(OverViewTask.finishCheck());
    }
    @Then("Validamos la pagina de completacion {string}")
    public void validamosLaPaginaDeCompletacion(String validText) {
        geuz.should(GivenWhenThen.seeThat(CompleteQuestion.OverviewSuccessful(validText)));
        geuz.wasAbleTo(CompleteTask.returnHome());

    }

}
