package com.startSharp.utils;

import com.github.javafaker.Faker;

public class DatosAleatorios {
    public static String idClienteAleatorio() {
        Faker faker = new Faker();
        return faker.idNumber().valid();
    }

    public static String nombreCompaniaAleatorio() {
        Faker faker = new Faker();
        return faker.company().name();
    }

    public static String nombreContactoAleatorio() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }
}
