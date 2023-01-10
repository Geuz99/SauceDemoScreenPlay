package com.saucedemo.main.questions;

import com.saucedemo.main.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FilterQuestion implements Question {
    private final String validtext;

    public FilterQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(HomeUI.TEXT_VALID_FILTER).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static FilterQuestion FilterSuccessful(String validtext){
        return new FilterQuestion((validtext));
    }
}
