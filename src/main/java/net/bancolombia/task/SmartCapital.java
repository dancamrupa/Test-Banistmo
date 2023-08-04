package net.bancolombia.task;

import net.bancolombia.interactions.WindowsChange;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.bancolombia.userInterface.CreateTextUserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class descargaPdf implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CORPORATE_OPTION),
                Click.on(SMART_CAPITAL),
                WindowsChange.onPage(),
                WaitUntil.the(ECONOMIC_CURRENT, isPresent()),
                Click.on(ECONOMIC_CURRENT),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(BUTTON_MORE),
                Click.on(PDF_LINK),
                Click.on(PDF_IMAGE),
                WindowsChange.onPage()
        );
    }

    public static descargaPdf onPage() {
        return Instrumented.instanceOf(descargaPdf.class).withProperties();
    }
}
