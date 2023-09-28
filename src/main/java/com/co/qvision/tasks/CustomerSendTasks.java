package com.co.qvision.tasks;

import com.co.qvision.models.TextMessage;
import com.co.qvision.userinterfaces.CustumerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CustomerSendTasks implements Task {
    TextMessage textMessage;

    public CustomerSendTasks(TextMessage textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(CustumerPage.A_COMMENT));
    actor.attemptsTo(Click.on(CustumerPage.BTN_CUSTUME));

    actor.attemptsTo(Enter.keyValues(textMessage.getMessage()).into(CustumerPage.TXT_MESSAGE));
    actor.attemptsTo(Click.on(CustumerPage.BTN_ENVIAR));
    }

    public static CustomerSendTasks customerSendTasks(TextMessage textMessage){
        return Tasks.instrumented(CustomerSendTasks.class,textMessage);
    }
}