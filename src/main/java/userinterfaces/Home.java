package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class Home extends PageObject {
    public static final Target OPCION_TARIFARIO = Target.the("Opcion para acceder a tarifario").located(By.xpath("//a[text()='Tarifario']"));
    public static final Target BODY = Target.the("Contenido general de la pagina").located(By.cssSelector("body"));
}
