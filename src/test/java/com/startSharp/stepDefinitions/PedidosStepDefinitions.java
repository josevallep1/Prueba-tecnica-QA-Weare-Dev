package com.startSharp.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PedidosStepDefinitions {
    @Managed
    private WebDriver browser;

    @Before
    public void setStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
    }

    @Cuando("el usuario selecciona la opcion Nuevo Pedido")
    public void elUsuarioSeleccionaLaOpcionNuevoPedido() {
    }

    @Y("selecciona el cliente aleatorio")
    public void seleccionaElClienteAleatorio() {
        
    }

    @Y("ingresa la fecha mayor a la actual {string} mes")
    public void ingresaLaFechaMayorALaActualMes(int arg0) {
        
    }

    @Y("selecciona el producto aleatorio")
    public void seleccionaElProductoAleatorio() {
        
    }

    @Y("selecciona la opcion Guardar")
    public void seleccionaLaOpcionGuardar() {
        
    }

    @Entonces("vera la pagina de pedidos")
    public void veraLaPaginaDePedidos() {
    }
}
