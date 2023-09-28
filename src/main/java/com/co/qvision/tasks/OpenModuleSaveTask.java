package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccommodationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenModuleSaveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccommodationPage.A_PERFIL));
        actor.attemptsTo(Click.on(AccommodationPage.SAVED_PERFIL));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static OpenModuleSaveTask openModuleSaveTask(){
        return Tasks.instrumented(OpenModuleSaveTask.class);
    }
}
