package co.com.AutoGfn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfiguracionPageGfn {

    public static final Target AJUSTES = Target.the("Enlace Ajustes")
            .located(By.xpath("//a[contains(@href,'/mi-cuenta-profile')]"));

    public static final Target INPUT_APODO = Target.the("Campo apodo")
            .located(By.name(":r8:"));

    public static final Target BOTON_GUARDAR = Target.the("Botón Guardar")
            .located(By.cssSelector("button.mui-btn[type='submit']"));

    public static final Target MENSAJE_CAMBIO_APODO = Target.the("Mensaje de apodo actualizado")
            .located(By.xpath("//span[contains(@class, 'mui-btn') and text()='Tu perfil ha sido actualizado']"));
}
