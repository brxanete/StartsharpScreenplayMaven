package is.serenity.demo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import is.serenity.demo.tasks.DoLoginTask;
import is.serenity.demo.tasks.OpenBrowserTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginUserStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor userAutomation = Actor.named("userAutomation");

    //Preparar al actor
    @Before
    public void preparedActorStage() {
        // Prepara todas la habilidades del actor (Web, mobile, API, desktop) por escenario
        OnStage.setTheStage(new OnlineCast());
        // El actor puede navegar a través de la web con el webDriver
        userAutomation.can(BrowseTheWeb.with(webDriver));
    }



    @Given("^Que voy a la pagina de inicio de sesion de startsharp$")
    public void queVoyALaPaginaDeInicioDeSesionDeStartsharp() {
        userAutomation.attemptsTo(OpenBrowserTask.openBrowser());

    }

    @When("^Ingreso mi usuario$")
    public void ingresoMiUsuario() {
        userAutomation.wasAbleTo(DoLoginTask.doLogin());
    }


    @When("^Ingreso mi clave$")
    public void ingresoMiClave() {

    }

    @When("^Selecciono el boton de iniciar sesion$")
    public void seleccionoElBotonDeIniciarSesion() {
    }

    @Then("^Valido el inicio de sesion correcto$")
    public void validoElInicioDeSesionCorrecto() {
    }
}
