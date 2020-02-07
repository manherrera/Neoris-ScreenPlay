package com.neoris.screenplay.exception;

public class AutenticacionFallidaError extends AssertionError {
    public AutenticacionFallidaError(String message, Throwable cause) {
        super(message, cause);
    }
}
