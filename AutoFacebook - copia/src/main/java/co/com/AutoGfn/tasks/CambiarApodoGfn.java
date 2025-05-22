package co.com.AutoGfn.tasks;

import co.com.AutoGfn.userinterface.ConfiguracionPageGfn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CambiarApodoGfn implements Task {

    private String nuevoApodo;

    public CambiarApodoGfn(String nuevoApodo) {
        this.nuevoApodo = nuevoApodo;
    }

    public static CambiarApodoGfn a(String apodo) {
        return instrumented(CambiarApodoGfn.class, apodo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ConfiguracionPageGfn.AJUSTES),
                Enter.theValue(nuevoApodo).into(ConfiguracionPageGfn.INPUT_APODO),
                Click.on(ConfiguracionPageGfn.BOTON_GUARDAR)
        );
    }
}
