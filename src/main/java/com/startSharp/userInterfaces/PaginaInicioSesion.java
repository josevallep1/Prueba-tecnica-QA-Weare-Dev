package com.startSharp.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion {
    public static final Target TXT_USUARIO = Target
            .the("Campo de texto para el usuario")
            .locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target TXT_CONTRASENIA = Target
            .the("Campo de texto para la contraseña")
            .locatedBy("//input[@id-test='LoginPanel0_Password']");

    public static final Target BTN_INICIAR_SESION = Target
            .the("Botón para iniciar sesión")
            .locatedBy("//button[@id='LoginPanel0_LoginButton']");
}
