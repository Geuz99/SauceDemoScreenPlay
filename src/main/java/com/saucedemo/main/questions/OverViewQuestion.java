package com.saucedemo.main.questions;

import com.saucedemo.main.ui.CheckOutUI;
import com.saucedemo.main.ui.OverviewUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OverViewQuestion implements Question {

    private final String validtext;

    public OverViewQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(OverviewUI.TEXT_VALID).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static OverViewQuestion CheckOutSuccessful(String validtext){
        return new OverViewQuestion((validtext));
    }
}
