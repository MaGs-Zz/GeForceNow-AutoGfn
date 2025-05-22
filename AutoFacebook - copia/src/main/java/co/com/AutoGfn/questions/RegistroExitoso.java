package co.com.AutoGfn.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistroExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static RegistroExitoso esVisible() {
        return new RegistroExitoso();
    }
}
