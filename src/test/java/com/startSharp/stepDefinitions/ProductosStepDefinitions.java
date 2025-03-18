package com.startSharp.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ProductosStepDefinitions {
    @Managed
    private WebDriver browser;

    @Before
    public void setStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
    }

    @Y("se ha creado un producto aleatorio")
    public void seHaCreadoUnProductoAleatorio() {
    }
}
