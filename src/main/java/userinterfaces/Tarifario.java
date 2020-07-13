package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Tarifario {
    public static final Target CUENTAS_DEPOSITO = Target.the("Link pdf de tarifas cuentas deposito").located(By.xpath("//span[contains(text(),'Tarifas de Cuentas de Depósitos')]//following::a[1]"));

}
