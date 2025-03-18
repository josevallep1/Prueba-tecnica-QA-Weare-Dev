package com.startSharp.tasks;

import com.startSharp.utils.DatosAleatorios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;

import static com.startSharp.userInterfaces.PaginaClientes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
                Enter.theValue(DatosAleatorios.tituloContactoAleatorio()).into(TXT_TITULO_CONTACTO),
                Enter.theValue("Andrew Fuller").into(TXT_NOMBRE_REPRESENTANTES),
                WaitUntil.the(TXT_NOMBRE_REPRESENTANTES, isVisible()).forNoMoreThan(2).seconds(),
                Hit.the(Keys.ENTER).into(TXT_NOMBRE_REPRESENTANTES),
                Enter.theValue(DatosAleatorios.direccionAleatoria()).into(TXT_DIRECCION),
                Click.on(LST_PAIS),
                Scroll.to(OPT_PAIS),
                Click.on(OPT_PAIS),
                Click.on(LST_CIUDAD),
                Scroll.to(OPT_CIUDAD),
                Click.on(OPT_CIUDAD),
                Enter.theValue(DatosAleatorios.regionAleatoria()).into(TXT_REGION),
                Enter.theValue(DatosAleatorios.codigoPostalAleatorio()).into(TXT_CODIGO_POSTAL),
                Enter.theValue(DatosAleatorios.telefonoAleatorio()).into(TXT_TELEFONO),
                Enter.theValue(DatosAleatorios.faxAleatorio()).into(TXT_FAX),
                Enter.theValue(DatosAleatorios.fechaUltimoContactoAleatoria()).into(TXT_FECHA_ULTIMO_CONTACTO),
                Scroll.to(LST_CONTACTADO_POR),
                Click.on(LST_CONTACTADO_POR),
                Scroll.to(OPT_CONTACTADO_POR),
                Click.on(OPT_CONTACTADO_POR),
                Enter.theValue(DatosAleatorios.correoAleatorio()).into(TXT_CORREO),
                Click.on(BTN_GUARDAR_CLIENTE)
        );
    }
}
