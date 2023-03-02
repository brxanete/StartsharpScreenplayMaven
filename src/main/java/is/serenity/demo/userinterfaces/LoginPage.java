package is.serenity.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {
    // Publicos para todo el proyecto y final porque puede que no cambie a traves del tiempo
    public static final Target INP_USERNAME = Target.the("INPUT USERNAME").located(By.xpath("//input[@name='Username']"));
    public static final Target INP_PASSWORD = Target.the("INPUT PASSWORD").located(By.xpath("//input[@name='Password']"));
    public static final Target BTN_SIGNIN = Target.the("BUTTON SIGN IN").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));
    // Validar nuestra excepcion
    public static final Target IMG_USER = Target.the("USER AVATAR").located(By.xpath("//i[@class='s-sidebar-band-icon fa fa-user']"));


}
