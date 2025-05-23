
package co.com.AutoGfn.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageGfn extends PageObject {

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón INICIA SESIÓN")
            .located(By.cssSelector("a.login-button"));

    public static final Target INPUT_USUARIO = Target.the("Campo correo")
            .located(By.name("username"));

    public static final Target INPUT_CONTRASENA = Target.the("Campo contraseña")
            .located(By.name("password"));

    public static final Target BOTON_CONFIRMAR_INICIO = Target.the("Botón Iniciar sesión")
            .located(By.cssSelector("button[name='login']"));

}
