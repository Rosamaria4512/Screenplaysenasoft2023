package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.sun.javafx.scene.control.skin.TableRowSkin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class AccommodationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AccommodationPage.SLT_TYPE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.OPT_TYPE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.SLT_OPTION_HOTEL));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.A_SEE_HOTEL));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.BTN_RESERVE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    public static AccommodationTask accommodationTask(){
        return Tasks.instrumented(AccommodationTask.class);
    }
}
