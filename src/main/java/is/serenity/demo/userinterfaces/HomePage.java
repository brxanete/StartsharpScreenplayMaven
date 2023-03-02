package is.serenity.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_NORTHWIND = Target.the("BUTTON NORTHWIND").located(By.xpath("(//span[@class='s-sidebar-link-text'])[2]"));
    public static final Target BTN_CUSTOMERS = Target.the("BUTTON CUSTOMER").located(By.xpath("(//span[@class='s-sidebar-link-text'])[3]"));

}
