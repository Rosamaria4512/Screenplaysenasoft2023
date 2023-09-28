package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import com.co.qvision.userinterfaces.SearchForTypePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class AccommodationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchForTypePage.SLT_TYPE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(SearchForTypePage.OPT_TYPE));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(SearchForTypePage.SLT_OPTION_HOTEL));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}


        actor.attemptsTo(Click.on(SearchForTypePage.A_SEE_HOTEL));
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(SearchForTypePage.BTN_RESERVE));


       // actor.attemptsTo(Click.on(AccommodationPage.A_SEE_HOTEL));
      //  try {Thread.sleep(15000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.BTN_RESERV));

        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    public static AccommodationTask accommodationTask(){
        return Tasks.instrumented(AccommodationTask.class);
    }
}
