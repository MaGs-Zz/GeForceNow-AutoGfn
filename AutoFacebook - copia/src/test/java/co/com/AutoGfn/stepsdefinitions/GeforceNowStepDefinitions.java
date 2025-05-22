package co.com.AutoGfn.stepsdefinitions;

import co.com.AutoGfn.models.DatosLogin;
import co.com.AutoGfn.tasks.CambiarApodoGfn;
import co.com.AutoGfn.tasks.IniciarSesionGfn;
import co.com.AutoGfn.tasks.AbrirPaginaGfn;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GeforceNowStepDefinitions {

    @Dado("^que estoy en la página de GeForce NOW$")
    public void abrirPagina() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaGfn.iniciar());
    }

    @Cuando("^inicio sesión con:$")
    public void inicioSesion(DataTable datos) {
        List<DatosLogin> datosLogin = datos.asList(DatosLogin.class);
        theActorInTheSpotlight().attemptsTo(IniciarSesionGfn.con(datosLogin));
    }

    @Cuando("^cambio mi apodo a \"([^\"]*)\"$")
    public void cambioApodo(String apodo) {
        theActorInTheSpotlight().attemptsTo(CambiarApodoGfn.a(apodo));
    }
}