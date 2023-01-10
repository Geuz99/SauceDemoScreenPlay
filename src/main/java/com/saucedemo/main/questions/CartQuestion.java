package com.saucedemo.main.questions;

import com.saucedemo.main.ui.CartUI;
import com.saucedemo.main.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartQuestion implements Question {
    private final String validtext;

    public CartQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(CartUI.ITEM_ON_CART_TEXT).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static CartQuestion ItemOnCartSuccessful(String validtext){
        return new CartQuestion((validtext));
    }

}
