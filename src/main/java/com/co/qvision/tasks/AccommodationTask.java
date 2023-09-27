package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.sun.javafx.scene.control.skin.TableRowSkin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class AccommodationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(AccommodationPage.CARD_PRODUCT_1));
        try {
            Thread.sleep(999000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(AccommodationPage.CART_1),Scroll.to(AccommodationPage.CART_2));

        actor.attemptsTo(Click.on(AccommodationPage.OP_FILTER));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Scroll.to(AccommodationPage.DIV_FILTROS_TYPE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(AccommodationPage.SLT_TYPE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(AccommodationPage.CARD_PRODUCT));
        actor.attemptsTo(Click.on(AccommodationPage.SEE_PRODUCT));
        actor.attemptsTo(Click.on(AccommodationPage.SLT_HOTEL));
        actor.attemptsTo(Click.on(AccommodationPage.BTN_RESERV));
        actor.attemptsTo(Click.on(AccommodationPage.SLT_AMOUNT));
        actor.attemptsTo(Click.on(AccommodationPage.BTN_RESERVED));
    }
    public static AccommodationTask accommodationTask(){
        return Tasks.instrumented(AccommodationTask.class);
    }
}
