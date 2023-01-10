package com.saucedemo.main.questions;

import com.saucedemo.main.ui.CompleteUI;
import com.saucedemo.main.ui.OverviewUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompleteQuestion implements Question {

    private final String validtext;

    public CompleteQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(CompleteUI.TEXT_VALID).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static CompleteQuestion OverviewSuccessful(String validtext){
        return new CompleteQuestion((validtext));
    }
}
