package co.com.AutoGfn.questions;
import static co.com.AutoGfn.userinterface.ConfiguracionPageGfn.MENSAJE_CAMBIO_APODO;
import static jxl.biff.FormatRecord.logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionApodo implements Question<Boolean> {

    public static ValidacionApodo validacionApodo() {
        return new ValidacionApodo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_CAMBIO_APODO).viewedBy(actor).asString();
            return "TU PERFIL HA SIDO ACTUALIZADO".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontró el texto");
            return false;
        }
    }
}
