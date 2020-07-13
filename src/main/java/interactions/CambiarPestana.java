package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class CambiarPestana implements Interaction {

    private String pestanaHome;
    private Set<String> pestanas;

    @Override
    public <T extends Actor> void performAs(T actor) {
        pestanaHome = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        pestanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String pestanaActual: pestanas){
            if(pestanaActual.equals(pestanaHome))
                BrowseTheWeb.as(actor).getDriver().switchTo().window(pestanaActual);
        }
    }

    public static CambiarPestana aNuevaPestana(){
        return new CambiarPestana();
    }
}
