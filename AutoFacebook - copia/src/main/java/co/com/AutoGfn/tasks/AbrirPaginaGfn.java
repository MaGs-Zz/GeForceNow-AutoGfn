package co.com.AutoGfn.tasks;
import co.com.AutoGfn.userinterface.InicioGfn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaGfn implements Task {

    InicioGfn pagina;

    public static AbrirPaginaGfn iniciar() {
        return Tasks.instrumented(AbrirPaginaGfn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina));
    }
}