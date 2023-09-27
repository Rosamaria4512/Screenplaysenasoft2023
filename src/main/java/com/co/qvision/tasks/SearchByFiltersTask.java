package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SearchByFiltersTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(AccommodationPage.DIV_FILTRES_PRICE));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Scroll.to(AccommodationPage.DIV_FILTRES_POPULAR));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        actor.attemptsTo(Click.on(AccommodationPage.SLT_FILTER_1));
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    public static SearchByFiltersTask searchByFiltersTask(){
        return Tasks.instrumented(SearchByFiltersTask.class);
    }
}
