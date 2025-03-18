package com.startSharp.tasks;

import com.startSharp.utils.DatosAleatorios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.startSharp.userInterfaces.PaginaClientes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Clientes implements Task {

    public static Clientes ingresarDatos() {
        return instrumented(Clientes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PanelPrincipal.seleccionarOpcionDelMenu("cliente"),
                Click.on(BTN_NUEVO_CLIENTE),
                Enter.theValue(DatosAleatorios.idClienteAleatorio()).into(TXT_CLIENTE_ID),
                Enter.theValue(DatosAleatorios.nombreCompaniaAleatorio()).into(TXT_NOMBRE_COMPANIA),
                Enter.theValue(DatosAleatorios.nombreContactoAleatorio()).into(TXT_NOMBRE_CONTACTO),
                Click.on(BTN_GUARDAR_CLIENTE)
        );
    }
}
