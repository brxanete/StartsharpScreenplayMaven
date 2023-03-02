package is.serenity.demo.userinterfaces;

import is.serenity.demo.utils.enums.ReplaceLocator;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CustomersPage {

    ReplaceLocator replace = new ReplaceLocator();

    public static final Target BTN_NEW_CUSTOMER = Target.the("BUTTON NEW CUSTOMER").located(By.xpath("(//span[@class='button-inner'])[1]"));
    public static final Target BTN_SAVE = Target.the("BUTTON SAVE").located(By.xpath("(//span[@class='button-inner'])[1]"));
    public static final Target INP_FILTER = Target.the("INPUT FILTER").located(By.xpath("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));

    public String ID_VALUE = "//a[text()='Replace']";









}
