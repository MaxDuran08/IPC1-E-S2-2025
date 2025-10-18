/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author Raxzorm
 */
public class vendedor implements Serializable {

    private String codigo;
    private String nombre;
    private String genero;
    private String contrasena;
    private String confirmados;

    public vendedor(String codigo, String nombre, String genero, String contrasena, String confirmados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.contrasena = contrasena;
        this.confirmados = confirmados;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + genero + ")";
    }
}
