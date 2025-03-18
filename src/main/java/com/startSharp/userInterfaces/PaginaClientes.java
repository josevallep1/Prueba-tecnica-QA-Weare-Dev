package com.startSharp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaClientes {

    public static final Target BTN_NUEVO_CLIENTE = Target
            .the("Boton para agregar un nuevo cliente")
            .locatedBy("//div[@data-action='add']");

    public static final Target TXT_CLIENTE_ID = Target
            .the("Texto para el id del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");


    public static final Target TXT_NOMBRE_COMPANIA = Target
            .the("Texto para el nombre de la compañia")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");


    public static final Target TXT_NOMBRE_CONTACTO = Target
            .the("Texto para el nombre de contacto")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactName']");

    public static final Target TXT_TITULO_CONTACTO = Target
            .the("Texto para el titulo del contacto")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactTitle']");

    public static final Target TXT_NOMBRE_REPRESENTANTES = Target
            .the("Texto nombre de los representantes")
            .locatedBy(" //input[@id='s2id_autogen10']");

    //input[@id='Serenity_Demo_Northwind_CustomerDialog9_Address']


    //input[@id='country']

    //input[@id='City']

    //input[@id='Serenity_Demo_Northwind_CustomerDialog9_Region']

    //input[@id='Serenity_Demo_Northwind_CustomerDialog9_PostalCode']

    //input[@id='Serenity_Demo_Northwind_CustomerDialog9_Fax']

    //input[@id='Serenity_Demo_Northwind_CustomerDialog9_LastContactDate']


    public static final Target BTN_GUARDAR_CLIENTE = Target
            .the("Boton para guardar un cliente")
            .locatedBy("//div[@data-action='save-and-close']");




}
