package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirTarifario;
import userinterfaces.Home;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static userinterfaces.Tarifario.CUENTAS_DEPOSITO;

public class VisualizacionTarifasStepDefinitions {
    private Home pagina;
    private static final String actorName = "Shara";

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actorName).attemptsTo(Open.browserOn(pagina));
    }

    @Cuando("^el usuario ingresa al tarifario de banistmo y elige ver las tarifas de cuentas deposito$")
    public void elUsuarioIngresaAlTarifarioDeBanistmo() {
        theActorCalled(actorName).attemptsTo(
                AbrirTarifario.de(CUENTAS_DEPOSITO)
        );
    }

    @Entonces("^deberia visualizar un pdf con las tarifas correspondientes$")
    public void deberiaVisualizarUnPdfConLasTarifasCorrespondientes() {

    }
}
