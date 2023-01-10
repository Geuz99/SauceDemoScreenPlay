package com.saucedemo.test.stepsdefinitions;

import com.saucedemo.main.questions.CartQuestion;
import com.saucedemo.main.tasks.AddToCartTask;
import com.saucedemo.main.tasks.CartTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddToCartStep {

    private Actor geuz;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        geuz = OnStage.theActorCalled("Geuz");
    }

    @Given("El cliente selecciona un item al carrito de compras")
    public void elClienteSeleccionaUnItemAlCarritoDeCompras() {
        geuz.wasAbleTo(AddToCartTask.addItem());
    }
    @When("El cliente ingresa al carrito de compras")
    public void elClienteIngresaAlCarritoDeCompras() {
        geuz.wasAbleTo((CartTask.OpenCart()));
    }
    @When("Validamos que el producto se encuentre en el carrito {string}")
    public void validamosQueElProductoSeEncuentreEnElCarrito(String string) {
        geuz.should(GivenWhenThen.seeThat(CartQuestion.ItemOnCartSuccessful(string)));
    }

}
