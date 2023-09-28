package com.co.qvision.questions;

import com.co.qvision.userinterfaces.CustumerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyMessaggeSend implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CustumerPage.VALIDATE_MESSAGE).viewedBy(actor).asBoolean();
    }
    public static VerifyMessaggeSend verifyMessaggeSend(){
        return new VerifyMessaggeSend();
    }
}
