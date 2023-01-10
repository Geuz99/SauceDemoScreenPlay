package com.saucedemo.main.questions;

import com.saucedemo.main.ui.CartUI;
import com.saucedemo.main.ui.CheckOutUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckQuestion implements Question {

    private final String validtext;

    public CheckQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(CheckOutUI.TEXT_VALID).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static CheckQuestion CheckSuccessful(String validtext){
        return new CheckQuestion((validtext));
    }
}
