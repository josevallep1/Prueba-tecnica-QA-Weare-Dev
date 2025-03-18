package com.startSharp.stepDefinitions;

import com.startSharp.tasks.InicioDeSesion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStepDefinitions {
    @Managed
    private WebDriver browser;
    Actor actor = Actor.named("usuario");

    @Before
    public void setStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
    }

    @Dado("que el usuario se ha logueado en la pagina StartSharp con credenciales validas")
    public void queElUsuarioSeHaLogueadoEnLaPaginaStartSharpConCredencialesValidas() {
        theActorCalled("Usuario").wasAbleTo(Open.url("https://demo.serenity.is/Account/Login/?ReturnUrl=%2f"));
        theActorInTheSpotlight().attemptsTo(
                InicioDeSesion.delUsuario("admin", "serenity")
        );
    }
}
