package co.com.AutoGfn.tasks;

import co.com.AutoGfn.models.DatosLogin;
import co.com.AutoGfn.userinterface.LoginPageGfn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import java.util.List;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesionGfn implements Task {

    private List<DatosLogin> datos;

    public IniciarSesionGfn(List<DatosLogin> datos) {
        this.datos = datos;
    }

    public static IniciarSesionGfn con(List<DatosLogin> datos) {
        return instrumented(IniciarSesionGfn.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosLogin dato = datos.get(0);

        actor.attemptsTo(
                Click.on(LoginPageGfn.BOTON_INICIAR_SESION),
                Enter.theValue(dato.getUsuario()).into(LoginPageGfn.INPUT_USUARIO),
                Enter.theValue(dato.getContrasena()).into(LoginPageGfn.INPUT_CONTRASENA),
                Click.on(LoginPageGfn.BOTON_CONFIRMAR_INICIO)
        );
    }
}