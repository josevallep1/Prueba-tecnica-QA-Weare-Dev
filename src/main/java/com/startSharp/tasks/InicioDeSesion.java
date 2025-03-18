package com.startSharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.startSharp.userInterfaces.PaginaInicioSesion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioDeSesion implements Task {

    private final String username;
    private final String password;

    public InicioDeSesion(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static InicioDeSesion delUsuario(String username, String password) {
        return instrumented(InicioDeSesion.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIAR_SESION)
        );
    }
}
