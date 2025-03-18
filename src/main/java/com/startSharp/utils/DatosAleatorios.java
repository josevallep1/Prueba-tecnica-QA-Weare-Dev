package com.startSharp.utils;

import net.datafaker.Faker;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DatosAleatorios {
    static Instant fechaActual = Instant.now();

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
        return faker.name().firstName().concat("test").concat(faker.name().lastName());
    }

    public static String tituloContactoAleatorio() {
        Faker faker = new Faker();
        return faker.name().title();
    }

    public static String direccionAleatoria() {
        Faker faker = new Faker();
        return faker.address().fullAddress();
    }

    public static String regionAleatoria() {
        Faker faker = new Faker();
        return faker.address().state();
    }

    public static String codigoPostalAleatorio() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String telefonoAleatorio() {
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public static String faxAleatorio() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    public  static String fechaUltimoContactoAleatoria(){
        Faker faker = new Faker();
        return faker.timeAndDate().between(fechaActual, fechaActual.plus(1, ChronoUnit.SECONDS), "MM/dd/YYY");
    }

    public static String correoAleatorio() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}
