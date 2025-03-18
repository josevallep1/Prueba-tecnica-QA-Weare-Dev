package com.startSharp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPanelPrincipal {
    public static final Target OPT_NORTHWIND = Target
            .the("Opcion de menu vientos del norte")
            .locatedBy("//*[@id='nav_menu1_2']//span[contains(text(), 'Northwind')]");

    public static final Target OPT_CLIENTES = Target
            .the("Opcion de menu clientes")
            .locatedBy("//*[@id='nav_menu1_2']//span[contains(text(), 'Customers')]");

    public static final Target OPT_ORDENES = Target
            .the("Opcion de menu ordenes")
            .locatedBy("//*[@id='nav_menu1_2']//span[contains(text(), 'Orders')]");

    public static final Target OPT_PRODUCTOS = Target
            .the("Opcion de menu productos")
            .locatedBy("//*[@id='nav_menu1_2']//span[contains(text(), 'Products')]");
}
