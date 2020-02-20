package com.neoris.screenplay.model;

import com.neoris.screenplay.exception.UsuarioEstadoIlegalException;

import static com.neoris.screenplay.util.ValidadorString.esVacioONulo;

public class Usuario {

    private final String usuario;
    private final String contrasena;
    private final String dni;


    public Usuario(String usuario, String contrasena, String dni) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dni = dni;

        validarEstado();
    }

    private void validarEstado() {
        if (esVacioONulo(usuario) || esVacioONulo(contrasena) || esVacioONulo(dni)) {
            throw new UsuarioEstadoIlegalException(String.format("Usuario (%s) o contrasena (%s) o Dni (%s) inválidos", usuario, contrasena, dni));
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDni () {return dni; }
}

