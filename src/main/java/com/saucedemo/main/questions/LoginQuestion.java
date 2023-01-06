package com.saucedemo.main.questions;

import com.saucedemo.main.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginQuestion implements Question{

    private final String validtext;

    public LoginQuestion(String validtext){
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(HomeUI.TEXT_VALID).answeredBy(actor).toString().equals(validtext.toString()))
            return true;
        else
            return false;
    }

    public static LoginQuestion loginSuccessful(String validtext){
        return new LoginQuestion((validtext));
    }

}
