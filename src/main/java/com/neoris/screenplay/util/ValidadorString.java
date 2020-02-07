package com.neoris.screenplay.util;

public class ValidadorString {
    public static boolean esVacioONulo(String valor) {
        return valor == null || valor.isEmpty();
    }
}