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
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CompanyName']");


    public static final Target TXT_NOMBRE_CONTACTO = Target
            .the("Texto para el nombre de contacto")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactName']");

    public static final Target TXT_TITULO_CONTACTO = Target
            .the("Texto para el titulo del contacto")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactTitle']");

    public static final Target TXT_NOMBRE_REPRESENTANTES = Target
            .the("Texto nombre de los representantes")
            .locatedBy("//input[@id='s2id_autogen10']");

    public static final Target TXT_DIRECCION = Target
            .the("Texto direccion del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Address']");

    public static final Target LST_PAIS = Target
            .the("Lista desplegable para seleccionar el pais")
            .locatedBy("//span[@id='select2-chosen-11']");

    public static final Target OPT_PAIS = Target
            .the("Opcion Mexico en la lista desplegable para seleccionar el pais")
            .locatedBy("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//div[contains(text(), 'Mexico')]");

    public static final Target LST_CIUDAD = Target
            .the("Lista desplegable para seleccionar la ciudad")
            .locatedBy("//span[@id='select2-chosen-12']");

    public static final Target OPT_CIUDAD = Target
            .the("Opcion México D.F. en la lista desplegable para seleccionar la ciudad")
            .locatedBy("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']//div[contains(text(), 'México D.F.')]");

    public static final Target TXT_REGION = Target
            .the("Texto region del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Region']");

    public static final Target TXT_CODIGO_POSTAL = Target
            .the("Texto codigo postal del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_PostalCode']");

    public static final Target TXT_TELEFONO = Target
            .the("Texto telefono del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Phone']");

    public static final Target TXT_FAX = Target
            .the("Texto FAX del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Fax']");

    public static final Target TXT_FECHA_ULTIMO_CONTACTO = Target
            .the("Texto FAX del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_LastContactDate']");

    public static final Target LST_CONTACTADO_POR = Target
            .the("Lista desplegable para seleccionar la persona que le contacto por ultima vez")
            .locatedBy("//span[@id='select2-chosen-13']");

    public static final Target OPT_CONTACTADO_POR = Target
            .the("Opcion Andrew Fuller en la lista desplegable para seleccionar la persona que le contacto por ultima vez")
            .locatedBy("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']//div[contains(text(), 'Andrew Fuller')]");

    public static final Target TXT_CORREO = Target
            .the("Texto correo del cliente")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Email']");

    public static final Target BTN_GUARDAR_CLIENTE = Target
            .the("Boton para guardar un cliente")
            .locatedBy("//div[@data-action='save-and-close']");




}
