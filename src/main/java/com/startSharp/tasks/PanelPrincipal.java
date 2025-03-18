package com.startSharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.startSharp.userInterfaces.PaginaPanelPrincipal.OPT_CLIENTES;
import static com.startSharp.userInterfaces.PaginaPanelPrincipal.OPT_NORTHWIND;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PanelPrincipal implements Task {

    private final String accion;
    private final String nombreOpcion;

    public PanelPrincipal(String accion) {
        this(accion, null);
    }


    public PanelPrincipal(String accion, String nombreOpcion) {
        this.accion = accion;
        this.nombreOpcion = nombreOpcion;
    }

    public static Task seleccionarOpcionDelMenu(String nombreOpcion) {
        return instrumented(PanelPrincipal.class, "seleccionarOpcionDelMenu", nombreOpcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (accion) {
            case "seleccionarOpcionDelMenu":
                switch (nombreOpcion) {
                    case "cliente":
                        actor.attemptsTo(
                                Click.on(OPT_NORTHWIND),
                                Click.on(OPT_CLIENTES)
                        );
                        break;
                }
                break;
        }
    }
}
