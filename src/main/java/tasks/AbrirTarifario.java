package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import interactions.CambiarPestana;

import static userinterfaces.Home.OPCION_TARIFARIO;

public class AbrirTarifario implements Task {

    private Target tipoTarifario;

    public AbrirTarifario(Target tipoTarifario) {
        this.tipoTarifario = tipoTarifario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_TARIFARIO),
                Click.on(tipoTarifario),
                CambiarPestana.aNuevaPestana()
                //SendKeys.of(Keys.CONTROL +"\t").into(BODY)
        );

    }

    public static AbrirTarifario de(Target tipoTarifario){
        return Tasks.instrumented(AbrirTarifario.class, tipoTarifario);
    }
}
