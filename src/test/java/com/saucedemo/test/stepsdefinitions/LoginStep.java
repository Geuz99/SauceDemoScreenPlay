package com.saucedemo.test.stepsdefinitions;


import com.saucedemo.main.questions.LoginQuestion;
import com.saucedemo.main.tasks.LoginTask;
import com.saucedemo.main.tasks.OpenTheBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    private Actor geuz;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        geuz = OnStage.theActorCalled("Geuz");
    }

    @Given("^El cliente ingresa a la pagina web$")
    public void el_cliente_ingresa_a_la_pagina_web() {
        geuz.wasAbleTo(OpenTheBrowser.on());
    }

    @When("^El cliente ingresa las credenciales (.+) y (.+)$")
    public void el_cliente_ingresa_las_credenciales_y(String usuario, String contrasenia){
        geuz.wasAbleTo(LoginTask.Login(usuario, contrasenia));
    }

    @Then("^validamos que estemos en la pagina principal (.+)$")
    public void validamos_que_estemos_en_la_pagina_principal(String validtexto) {
        geuz.should(GivenWhenThen.seeThat(LoginQuestion.loginSuccessful(validtexto)));

    }

}
