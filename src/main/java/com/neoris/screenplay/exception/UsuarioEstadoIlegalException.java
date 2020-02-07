package com.neoris.screenplay.exception;

public class UsuarioEstadoIlegalException extends IllegalStateException {

    public UsuarioEstadoIlegalException(String mensaje) {
        super(mensaje);
    }
}